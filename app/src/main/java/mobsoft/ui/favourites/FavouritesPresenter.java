package mobsoft.ui.favourites;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import mobsoft.interactor.detail.DetailsInteractor;
import mobsoft.interactor.favourites.FavouritesInteractor;
import mobsoft.interactor.login.LoginInteractor;
import mobsoft.interactor.search.SearchInteractor;
import mobsoft.ui.Presenter;
import mobsoft.ui.login.LoginScreen;

import static mobsoft.MobSoftApplication.injector;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class FavouritesPresenter extends Presenter<FavouritesScreen> {

    @Inject
    LoginInteractor loginInteractor;

    @Inject
    SearchInteractor searchInteractor;

    @Inject
    DetailsInteractor detailsInteractor;

    @Inject
    FavouritesInteractor favouritesInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(FavouritesScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }
}
