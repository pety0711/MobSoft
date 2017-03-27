package mobsoft.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import mobsoft.R;
import mobsoft.model.Movie;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class DetailActivity extends AppCompatActivity implements DetailScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showDetail(Movie movie) {
        Toast.makeText(this, "Movie Screen", Toast.LENGTH_SHORT).show();
    }
}