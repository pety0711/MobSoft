package mobsoft.ui.search;

/**
 * Created by mobsoft on 2017. 03. 27..
 */
import mobsoft.ui.Presenter;

/**
 * Created by Patrik on 2017. 03. 19..
 */

public class SearchPresenter extends Presenter<SearchScreen> {

    private static SearchPresenter instance = null;

    private SearchPresenter() {
    }

    public static SearchPresenter getInstance() {
        if (instance == null) {
            instance = new SearchPresenter();
        }
        return instance;
    }

    @Override
    public void attachScreen(SearchScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}