package mobsoft.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.helper.GsonHelper;
import mobsoft.network.movieviewer.MovieViewerAPI;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by petys on 2017. 04. 22..
 */

@Module
public class NetworkModule {
    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient().newBuilder();
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public MovieViewerAPI provideMovieViewerAPI(Retrofit retrofit) {
        return retrofit.create(MovieViewerAPI.class);
    }
}
