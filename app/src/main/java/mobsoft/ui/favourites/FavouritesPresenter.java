package mobsoft.ui.favourites;

import mobsoft.ui.Presenter;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class FavouritesPresenter extends Presenter<FavouritesScreen> {

    private static FavouritesPresenter instance = null;

    private FavouritesPresenter() {}

    public static FavouritesPresenter getInstance() {
        if (instance == null) {
            instance = new FavouritesPresenter();
        }

        return instance;
    }

    @Override
    public void attachScreen(FavouritesScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

}
