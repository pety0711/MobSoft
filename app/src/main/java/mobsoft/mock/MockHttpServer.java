package mobsoft.mock;

import mobsoft.mock.interceptors.MockInterceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by petys on 2017. 04. 22..
 */

public class MockHttpServer {
    public static Response call(Request request) {
        MockInterceptor mockInterceptor = new MockInterceptor();
        return mockInterceptor.process(request);
    }
}

