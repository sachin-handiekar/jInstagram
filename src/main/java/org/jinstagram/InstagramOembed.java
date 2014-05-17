package org.jinstagram;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.entity.common.InstagramErrorResponse;
import org.jinstagram.entity.oembed.OembedInformation;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Response;
import org.jinstagram.http.Verbs;
import org.jinstagram.model.Constants;
import org.jinstagram.model.Methods;

import java.io.IOException;
import java.util.Map;

/**
 * Instagram Oembed
 *
 * @author Sachin Handiekar
 */
public class InstagramOembed {
    /**
     * Returns information about the media associated with that link.
     *
     * @param url A short link, like http://instagr.am/p/BUG/.
     * @return OembedInformation object
     * @throws org.jinstagram.exceptions.InstagramException if any error occurs.
     */
    public OembedInformation getOembedInformation(String url)
            throws InstagramException {
        String apiMethod = String.format(Methods.OEMBED_INFORMATION, url);
        OembedInformation information = createInstagramObject(Verbs.GET,
                OembedInformation.class, apiMethod, null);
        return information;
    }


    /**
     * Create a instagram object based on class-name and response.
     *
     * @param verbs HTTP State
     * @param clazz
     * @param methodName
     * @param params
     * @return
     * @throws InstagramException
     */
    private <T> T createInstagramObject(Verbs verbs, Class<T> clazz, String methodName, Map<String, String> params)
            throws InstagramException {
        Response response;
        try {
            response = getApiResponse(verbs, methodName, params);
        } catch (IOException e) {
            throw new InstagramException("IOException while retrieving data", e);
        }

        if (response.getCode() >= 200 && response.getCode() < 300) {
            T object = createObjectFromResponse(clazz, response.getBody());

            return object;
        }

        throw handleInstagramError(response);
    }

    private InstagramException handleInstagramError(Response response) throws InstagramException {
        if (response.getCode() == 400) {
            Gson gson = new Gson();
            final InstagramErrorResponse error = InstagramErrorResponse.parse(gson, response.getBody());
            error.setHeaders(response.getHeaders());
            error.throwException();
        }
        throw new InstagramException("Unknown error response code: " + response.getCode() + " " + response.getBody(), response.getHeaders());
    }

    /**
     * Get response from Instagram.
     *
     * @param verb HTTP Verb
     * @param methodName Instagram API Method
     * @param params parameters which would be sent with the request.
     * @return Response object.
     */
    private Response getApiResponse(Verbs verb, String methodName, Map<String, String> params) throws IOException {
        Response response = null;
        String apiResourceUrl = Constants.API_URL + methodName;
        OAuthRequest request = new OAuthRequest(verb, apiResourceUrl);

        // Additional parameters in url
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (verb == Verbs.GET) {
                    request.addQuerystringParameter(entry.getKey(), entry.getValue());
                }
                else {
                    request.addBodyParameter(entry.getKey(), entry.getValue());
                }
            }
        }

        response = request.send();

        return response;
    }

    /**
     * Creates an object from the JSON response and the class which the object would be mapped to.
     *
     * @param clazz a class instance
     * @param response a JSON feed
     * @return a object of type <T>
     * @throws InstagramException if any error occurs.
     */
    private <T> T createObjectFromResponse(Class<T> clazz, final String response) throws InstagramException {
        Gson gson = new Gson();
        T object = null;

        try {
            object = clazz.newInstance();
            object = gson.fromJson(response, clazz);
        }
        catch (InstantiationException e) {
            throw new InstagramException("Problem in Instantiation of type " + clazz.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new InstagramException("Couldn't create object of type " + clazz.getName(), e);
        }
        catch (Exception e) {
            throw new InstagramException("Error parsing json to object type " + clazz.getName(), e);
        }

        return object;
    }
}
