package mobsoft.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import javax.inject.Inject;

import mobsoft.MobSoftApplication;
import mobsoft.R;
import mobsoft.model.Item;

public class MainActivity extends AppCompatActivity implements MainScreen{

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showItems(List<Item> items) {
        //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
