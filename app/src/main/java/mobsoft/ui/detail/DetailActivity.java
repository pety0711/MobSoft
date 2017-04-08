package mobsoft.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import mobsoft.MobSoftApplication;
import mobsoft.R;
import mobsoft.model.Movie;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class DetailActivity extends AppCompatActivity implements DetailScreen {

    @Inject
    DetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);
    }

    @Override
    public void showDetail(Movie movie) {
        Toast.makeText(this, "Movie Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void addToFavourites(Movie movie) {
        Toast.makeText(this, "Add to favourites", Toast.LENGTH_SHORT).show();
    }
}
