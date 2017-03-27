package mobsoft.ui.favourites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import mobsoft.R;
import mobsoft.model.Item;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class FavouritesActivity extends AppCompatActivity implements FavouritesScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showFavourites(List<Item> items) {
        Toast.makeText(this, "Favourites Screen", Toast.LENGTH_SHORT).show();
    }
}