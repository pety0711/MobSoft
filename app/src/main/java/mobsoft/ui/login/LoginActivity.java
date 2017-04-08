package mobsoft.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import mobsoft.MobSoftApplication;
import mobsoft.R;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class LoginActivity extends AppCompatActivity implements LoginScreen {



    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, "Login Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToMain() {
        Toast.makeText(this, "Go to main", Toast.LENGTH_SHORT).show();
    }
}
