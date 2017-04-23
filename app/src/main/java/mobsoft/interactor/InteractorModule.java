package mobsoft.interactor;

import dagger.Module;
import dagger.Provides;
import mobsoft.interactor.detail.DetailsInteractor;
import mobsoft.interactor.favourites.FavouritesInteractor;
import mobsoft.interactor.login.LoginInteractor;
import mobsoft.interactor.search.SearchInteractor;
import mobsoft.model.User;

/**
 * Created by petys on 2017. 04. 21..
 */

@Module
public class InteractorModule {
    @Provides
    public SearchInteractor provideSearchInteractor() {
        return new SearchInteractor();
    }

    @Provides
    public LoginInteractor provideLoginInteractor() {
        return new LoginInteractor();
    }

    @Provides
    public FavouritesInteractor provideFavouritesInteractor() {
        return new FavouritesInteractor();
    }

    @Provides
    public DetailsInteractor provideDetailsInteractor() {
        return new DetailsInteractor();
    }
 }
