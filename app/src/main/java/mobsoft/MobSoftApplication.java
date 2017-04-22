package mobsoft;

import android.app.Application;

import javax.inject.Inject;

import mobsoft.repository.Repository;
import mobsoft.ui.UIModule;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class MobSoftApplication extends Application {

    @Inject
    Repository repository;

    public static MobSoftApplicationComponent injector;

    public void setInjector(MobSoftApplicationComponent applicationComponent) {
        injector = applicationComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        injector = DaggerMobSoftApplicationComponent.builder().
                uIModule(new UIModule(this)).build();
        injector.inject(this);
        repository.open(getApplicationContext());
    }
}