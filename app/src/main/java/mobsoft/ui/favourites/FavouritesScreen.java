package mobsoft.ui.favourites;

import java.util.List;

import mobsoft.model.Item;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public interface FavouritesScreen {
    void showFavourites(List<Item> items);

    void navigateToDetail(Item item);
}
