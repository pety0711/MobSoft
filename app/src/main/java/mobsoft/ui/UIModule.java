package mobsoft.ui;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.ui.detail.DetailPresenter;
import mobsoft.ui.favourites.FavouritesPresenter;
import mobsoft.ui.login.LoginPresenter;
import mobsoft.ui.main.MainPresenter;
import mobsoft.ui.search.SearchPresenter;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public SearchPresenter provideSearchPresenter() {return SearchPresenter.getInstance();}

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {return LoginPresenter.getInstance();}

    @Provides
    @Singleton
    public FavouritesPresenter provideFavouritesPresenter() {return FavouritesPresenter.getInstance();}

    @Provides
    @Singleton
    public DetailPresenter provideDetailPresenter() {return DetailPresenter.getInstance();}

}
