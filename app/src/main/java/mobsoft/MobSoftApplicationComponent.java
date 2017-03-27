package mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import mobsoft.ui.UIModule;
import mobsoft.ui.detail.DetailActivity;
import mobsoft.ui.favourites.FavouritesActivity;
import mobsoft.ui.login.LoginActivity;
import mobsoft.ui.main.MainActivity;
import mobsoft.ui.search.SearchActivity;

/**
 * Created by mobsoft on 2017. 03. 27..
 */


@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);

    void inject(SearchActivity searchActivity);

    void inject(FavouritesActivity favouritesActivity);

    void inject(DetailActivity detailActivity);
}
