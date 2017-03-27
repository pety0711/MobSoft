package mobsoft.ui.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import mobsoft.MobSoftApplication;
import mobsoft.R;
import mobsoft.model.Item;

public class SearchActivity extends AppCompatActivity implements SearchScreen {

    @Inject
    SearchPresenter searchPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);
    }


    @Override
    public void showItems(List<Item> items) {
        Toast.makeText(this, "Search Screen", Toast.LENGTH_SHORT).show();
    }

}
