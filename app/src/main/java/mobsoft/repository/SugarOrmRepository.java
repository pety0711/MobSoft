package mobsoft.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mobsoft.model.Item;
import mobsoft.model.Movie;
import mobsoft.model.User;
import com.orm.SugarContext;
import com.orm.SugarRecord;
import com.orm.query.Condition;
import com.orm.query.Select;

/**
 * Created by mobsoft on 2017. 04. 10..
 */
public class SugarOrmRepository implements Repository {
    @Override
    public void open(Context context) { SugarContext.init(context); }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Item> getItemsAll() {
        return SugarRecord.listAll(Item.class);
    }

    @Override
    public List<Item> getItemsById(Long[] ids) {
        List<Item> items = SugarRecord.listAll(Item.class);
        List<Item> result = new ArrayList<Item>();
        for (Item item :
                items) {
            for (Long id :
                    ids) {
                if (item.getID() == id) {
                    result.add(item);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Item> searchItemsByName(String name) {
        return SugarRecord.find(Item.class, "title Like %?%", name);
    }

    @Override
    public Item getItemByID(Long id) {
        return SugarRecord.find(Item.class, "id = ?", Long.toString(id)).get(0);
    }

    @Override
    public Movie getMovieByID(Long id) {
        return SugarRecord.find(Movie.class, "id = ?", Long.toString(id)).get(0);
    }

    @Override
    public List<User> getUsers() {
        return SugarRecord.listAll(User.class);
    }

    @Override
    public void saveUser(User user) {
        SugarRecord.save(user);
    }

    @Override
    public boolean isInDB(Item item) {
        return SugarRecord.findById(Item.class, item.getID()) != null;
    }

    @Override
    public boolean isInDB(Movie movie) {

        return SugarRecord.findById(Movie.class, movie.getId()) != null;
    }

    @Override
    public boolean isInDB(User user) {
        return SugarRecord.findById(User.class, user.getId()) != null;
    }

    @Override
    public List<Item> getFavourites(User user) {
        return user.getFavourites();
    }

    @Override
    public void addFavourite(User user, Item item) {
        user.addFavourite(item);
    }

    @Override
    public void updateFavourites(User user, List<Item> items) {
        user.setFavourites(items);
    }

    @Override
    public void removeFavourite(User user, Item item) {
        user.removeFavourite(item);
    }
}
