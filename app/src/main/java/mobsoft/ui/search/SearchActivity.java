package mobsoft.ui.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import mobsoft.R;
import mobsoft.model.Item;

public class SearchActivity extends AppCompatActivity implements SearchScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void showItems(List<Item> items) {
        Toast.makeText(this, "Search Screen", Toast.LENGTH_SHORT).show();
    }

}
