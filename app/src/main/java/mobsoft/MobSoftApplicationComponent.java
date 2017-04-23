package mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import mobsoft.interactor.InteractorModule;
import mobsoft.interactor.detail.DetailsInteractor;
import mobsoft.interactor.favourites.FavouritesInteractor;
import mobsoft.interactor.search.SearchInteractor;
import mobsoft.network.NetworkModule;
import mobsoft.repository.RepositoryModule;
import mobsoft.ui.UIModule;
import mobsoft.ui.detail.DetailActivity;
import mobsoft.ui.detail.DetailPresenter;
import mobsoft.ui.favourites.FavouritesActivity;
import mobsoft.ui.favourites.FavouritesPresenter;
import mobsoft.ui.login.LoginActivity;
import mobsoft.ui.login.LoginPresenter;
import mobsoft.ui.main.MainActivity;
import mobsoft.ui.main.MainPresenter;
import mobsoft.ui.search.SearchActivity;
import mobsoft.ui.search.SearchPresenter;

/**
 * Created by mobsoft on 2017. 03. 27..
 */


@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class, NetworkModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);

    void inject(SearchActivity searchActivity);

    void inject(FavouritesActivity favouritesActivity);

    void inject(DetailActivity detailActivity);

    void inject(SearchInteractor searchInteractor);

    void inject(MobSoftApplication mobSoftApplication);

    void inject(FavouritesInteractor favouritesInteractor);

    void inject(DetailsInteractor detailsInteractor);

    void inject(MainPresenter mainPresenter);

    void inject(LoginPresenter loginPresenter);

    void inject(FavouritesPresenter favouritesPresenter);

    void inject(DetailPresenter detailPresenter);

    void inject(SearchPresenter searchPresenter);
}
