package mobsoft.ui.detail;

import mobsoft.ui.Presenter;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class DetailPresenter extends Presenter<DetailScreen> {

    private static DetailPresenter instance = null;

    private DetailPresenter() {}

    public static DetailPresenter getInstance() {
        if (instance == null) {
            instance = new DetailPresenter();
        }

        return instance;
    }

    @Override
    public void attachScreen(DetailScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
