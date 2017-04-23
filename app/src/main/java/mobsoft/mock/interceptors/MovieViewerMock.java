package mobsoft.mock.interceptors;

import android.net.Uri;

import mobsoft.helper.GsonHelper;
import mobsoft.network.NetworkConfig;
import mobsoft.repository.MemoryRepository;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

import static mobsoft.mock.interceptors.MockHelper.makeResponse;

/**
 * Created by petys on 2017. 04. 22..
 */

public class MovieViewerMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();


        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Favourite") && request.method().toLowerCase().equals("post")) {
            responseString = "";
            responseCode = 200;
        }else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Favourite") && request.method().toLowerCase().equals("get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getFavourites(memoryRepository.getUsers().get(0)));
            responseCode = 200;
        } else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Item") && request.method().toLowerCase().equals("get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getItemsAll());
            responseCode = 200;
        } else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Movie") && request.method().toLowerCase().equals("get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getMovieByID(1L));
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return makeResponse(request, headers, responseCode, responseString);
    }
}
