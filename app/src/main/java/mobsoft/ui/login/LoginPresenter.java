package mobsoft.ui.login;

import mobsoft.ui.Presenter;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class LoginPresenter extends Presenter<LoginScreen> {
    private static LoginPresenter instance = null;

    private LoginPresenter() {

    }

    public static LoginPresenter getInstance() {
        if (instance == null) {
            instance = new LoginPresenter();
        }

        return instance;
    }

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

}
