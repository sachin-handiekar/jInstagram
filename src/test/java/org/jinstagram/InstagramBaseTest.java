package org.jinstagram;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Request;
import org.jinstagram.http.Response;
import org.jinstagram.http.Verbs;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({InstagramBase.class, Instagram.class, OAuthRequest.class, Gson.class, Request.class})
public class InstagramBaseTest {
    private static final String ACCESS_TOKEN = "12412fasfg12";
    private static final String USER_ID = "123";
    private static final String MEDIA_ID = "456.asgz";
    private static final String CLIENT_ID = "abc123";
    private static final java.lang.String RESPONSE_BODY = "{Response: body}";

    @Mock
    private Request request;

    @Mock
    private OAuthRequest oAuthRequest;

    @Mock
    private Response response;

    @Mock
    private Gson gson;

    private InstagramConfig config = new InstagramConfig();
    private InstagramBase instagramBase;

    @Before
    public void setUp() throws Exception {
        givenGson();
        when(request.getCharset()).thenReturn("UTF-8");
        when(request.getVerb()).thenReturn(Verbs.GET);
        when(request.getUrl()).thenReturn("/mock/");

    }

    @Test
    public void shouldGetMediaCommentsFeedWithoutRetrying() throws Exception {
        givenInstagramBaseWithRetryEnabled(false, config);
        givenResponse();
        givenParsingWithoutError();

        whenGettingMediaComments();

        thenRequestIsSent(1);
        thenGsonIsParsed(1);
    }

    @Test
    public void shouldRetryWhenGetMediaCommentsFeedFailsOnTheFirstTry() throws Exception {
        givenInstagramBaseWithRetryEnabled(true, config);
        givenResponse();
        givenFailureInFirstParsing();

        whenGettingMediaComments();

        thenRequestIsSent(2);
        thenGsonIsParsed(3);
    }

    private void givenParsingWithoutError() {
        when(gson.fromJson(anyString(), any(Class.class))).thenReturn(new MediaCommentsFeed());
    }

    private void givenFailureInFirstParsing() {
        when(gson.fromJson(anyString(), any(Class.class)))
                .thenThrow(new JsonSyntaxException(""))
                .thenReturn(new MediaCommentsFeed());
    }

    private void givenInstagramBaseWithRetryEnabled(boolean retryOnStreamFailure, InstagramConfig config) {
        config.setRetryOnServerError(retryOnStreamFailure);
        instagramBase = new Instagram(CLIENT_ID, config);
    }


    private void givenResponse() throws Exception {
        when(response.getCode()).thenReturn(200);
        when(oAuthRequest.send()).thenReturn(response);
        whenNew(Request.class).withAnyArguments().thenReturn(request);
        whenNew(OAuthRequest.class).withAnyArguments().thenReturn(oAuthRequest);
        when(response.getBody()).thenReturn(RESPONSE_BODY);
    }

    private void givenGson() throws Exception {
        whenNew(Gson.class).withAnyArguments().thenReturn(gson);
    }

    private void thenGsonIsParsed(final int wantedNumberOfInvocations) {
        verify(gson, times(wantedNumberOfInvocations)).fromJson(eq(RESPONSE_BODY), any(Class.class));
    }

    private void thenRequestIsSent(final int wantedNumberOfInvocations) throws IOException {
        verify(oAuthRequest, times(wantedNumberOfInvocations)).send();
    }

    private void whenGettingMediaComments() throws InstagramException {
        instagramBase.getMediaComments(MEDIA_ID);
    }
}