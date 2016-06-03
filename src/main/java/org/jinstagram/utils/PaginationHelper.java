package org.jinstagram.utils;

import org.apache.commons.lang3.StringUtils;
import org.jinstagram.auth.exceptions.OAuthException;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.http.URLUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by rdouglas on 6/2/16.
 */
public class PaginationHelper {

    public static Page parseNextUrl(Pagination pagination, String apiUrl) {
        if(StringUtils.isNotBlank(pagination.getNextUrl())) {
            try {
                String nextUrl = pagination.getNextUrl();
                URL url = new URL(nextUrl);

                Map<String,String> params = URLUtils.queryStringToMap(url.getQuery());

                String methodName = StringUtils.substringBetween(nextUrl,apiUrl,"?");

                return new Page(methodName,params);
            } catch (MalformedURLException mue) {
                throw new OAuthException("Malformed URL", mue);
            }
        }

        throw new OAuthException("No nextUrl");
    }

    public static class Page {
        private String methodName;
        private Map<String,String> queryStringParams;

        public Page(String methodName, Map<String,String> params) {
            this.methodName = methodName;
            this.queryStringParams = params;
        }

        public String getMethodName() {
            return methodName;
        }

        public String getRawMethodName() {
            return URLUtils.decodeURIComponent(methodName);
        }
        public Map<String, String> getQueryStringParams() {
            return queryStringParams;
        }
    }
}
