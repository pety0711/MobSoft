package mobsoft.repository;

import android.content.Context;

import java.util.List;

import mobsoft.model.Item;
import mobsoft.model.Movie;
import mobsoft.model.User;

/**
 * Created by mobsoft on 2017. 04. 10..
 */
public interface Repository {

    void open(Context context);

    void close();

    List<Item> getItemsAll();

    List<Item> getItemsById(Long[] ids);

    List<Item> searchItemsByName(String name);

    Item getItemByID(Long id);

    Movie getMovieByID(Long id);

    List<User> getUsers();

    void saveUser(User user);

    boolean isInDB(Item item);

    boolean isInDB(Movie movie);

    boolean isInDB(User user);

    List<Item> getFavourites(User user);

    void addFavourite(User user, Item item);

    void updateFavourites(User user, List<Item> items);

    void removeFavourite(User user, Item item);
}

