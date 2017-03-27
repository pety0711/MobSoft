package mobsoft.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import mobsoft.R;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class LoginActivity extends AppCompatActivity implements LoginScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, "Login Screen", Toast.LENGTH_SHORT).show();
    }
}
