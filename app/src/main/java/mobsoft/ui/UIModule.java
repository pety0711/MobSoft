package mobsoft.ui;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;
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
    public SearchPresenter provideSearchPresenter() {return new SearchPresenter();}

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {return new LoginPresenter();}

    @Provides
    @Singleton
    public FavouritesPresenter provideFavouritesPresenter() {return new FavouritesPresenter();}

    @Provides
    @Singleton
    public DetailPresenter provideDetailPresenter() {return new DetailPresenter();}

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Executor provideExecutor() {
        return Executors.newFixedThreadPool(1);
    }

}
