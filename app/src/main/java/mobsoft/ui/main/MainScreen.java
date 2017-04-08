package mobsoft.ui.main;

import java.util.List;

import mobsoft.model.Item;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public interface MainScreen {
    void showItems(List<Item> items);

    void navigateToFavourites();

    void navigateToDetail(Item item);

    void search(String str);
}