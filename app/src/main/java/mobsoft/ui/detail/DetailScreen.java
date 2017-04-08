package mobsoft.ui.detail;

import mobsoft.model.Movie;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public interface DetailScreen {
    void showDetail(Movie movie);

    void addToFavourites(Movie movie);
}
