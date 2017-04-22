package mobsoft.network.movieviewer;

import mobsoft.model.Movie;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by petys on 2017. 04. 22..
 */

public interface MovieViewerAPI {
    @POST("MovieViewer")
    Call<Void> MovieViewerCreate(
        @Body Movie data
    );
}
