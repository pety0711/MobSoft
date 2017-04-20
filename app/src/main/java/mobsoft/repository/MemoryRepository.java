package mobsoft.repository;

import android.content.Context;

import java.util.List;

import mobsoft.model.Item;
import mobsoft.model.Movie;
import mobsoft.model.User;

/**
 * Created by mobsoft on 2017. 04. 10..
 */

public class MemoryRepository implements Repository {
    @Override
    public void open(Context context) {

    }

    @Override
    public void close() {

    }

    @Override
    public List<Item> getItemsAll() {
        return null;
    }

    @Override
    public List<Item> getItemsById(int[] ids) {
        return null;
    }

    @Override
    public List<Item> searchItemsByName(String name) {
        return null;
    }

    @Override
    public Item getItemByID(int id) {
        return null;
    }

    @Override
    public List<Item> getFavouritesForUser(User user) {
        return null;
    }

    @Override
    public void addFavouriteToUser(User user, Item item) {

    }

    @Override
    public Movie getMovieByID(int id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public boolean isInDB(Item item) {
        return false;
    }

    @Override
    public boolean isInDB(Movie movie) {
        return false;
    }

    @Override
    public boolean isInDB(User user) {
        return false;
    }
}
