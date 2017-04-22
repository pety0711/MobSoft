package mobsoft.interactor.detail.event;

import java.util.List;

import mobsoft.model.Item;
import mobsoft.model.Movie;

/**
 * Created by petys on 2017. 04. 21..
 */

public class GetMovieEvent {
    private int code;
    private Movie movie;
    private Throwable throwable;

    public GetMovieEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
