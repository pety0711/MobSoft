package mobsoft.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mobsoft.model.Item;
import mobsoft.model.Movie;
import mobsoft.model.User;

/**
 * Created by mobsoft on 2017. 04. 10..
 */

public class MemoryRepository implements Repository {

    public static List<Item> items;
    public static List<Movie> movies;
    public static List<User> users;

    @Override
    public void open(Context context) {
        items = new ArrayList<>();
        Item item1 = new Item();
        item1.setID(1L);
        item1.setImageURL("http://t1.gstatic.com/images?q=tbn:ANd9GcRf61mker2o4KH3CbVE7Zw5B1-VogMH8LfZHEaq3UdCMLxARZAB");
        item1.setTitle("Interstellar");
        items.add(item1);

        Item item2 = new Item();
        item2.setID(2L);
        item2.setImageURL("http://t0.gstatic.com/images?q=tbn:ANd9GcSMztVicsYXcHHWNkejxIoFcW4H1eKhjSghAVixeAueuPEXmSKN");
        item2.setTitle("Arrival");
        items.add(item2);

        movies = new ArrayList<>();
        Movie movie1 = new Movie();
        movie1.setId(1L);
        movie1.setImageURL("http://t1.gstatic.com/images?q=tbn:ANd9GcRf61mker2o4KH3CbVE7Zw5B1-VogMH8LfZHEaq3UdCMLxARZAB");
        movie1.setTitle("Interstellar");
        movie1.setDescription("In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home.");
        movie1.setActors(Arrays.asList(new String[]{"Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"}));
        movies.add(movie1);

        Movie movie2 = new Movie();
        movie2.setId(2L);
        movie2.setImageURL("http://t0.gstatic.com/images?q=tbn:ANd9GcSMztVicsYXcHHWNkejxIoFcW4H1eKhjSghAVixeAueuPEXmSKN");
        movie2.setTitle("Arrival");
        movie2.setDescription("Linguistics professor Louise Banks (Amy Adams) leads an elite team of investigators when gigantic spaceships touch down in 12 locations around the world. As nations teeter on the verge of global war, Banks and her crew must race against time to find a way to communicate with the extraterrestrial visitors. Hoping to unravel the mystery, she takes a chance that could threaten her life and quite possibly all of mankind.");
        movie2.setActors(Arrays.asList(new String[]{"Amy Adams", "Jeremy Renner", "Forest Whitaker"}));
        movies.add(movie2);

        movie1.setItemId(item1.getID());
        item1.setMovieID(movie1.getId());

        movie2.setItemId(item2.getID());
        item2.setMovieID(movie2.getId());

        users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Attila");
        user1.setPassword("Kecske");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Szek");
        user2.setPassword("Asztal");
        users.add(user2);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Item> getItemsAll() {
        return items;
    }

    @Override
    public List<Item> getItemsById(Long[] ids) {
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
        List<Item> result = new ArrayList<Item>();
        for (Item item :
                items) {
            if (item.getTitle().contains(name)) {
                result.add(item);
                break;
            }
        }
        return result;
    }

    @Override
    public Item getItemByID(Long id) {
        for (Item item :
                items) {
            if (item.getID() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Movie getMovieByID(Long id) {
        for (Movie movie: movies) {
            if (movie.getId() == id)
                return movie;
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void saveUser(User user) {
        users.add(user);
    }

    @Override
    public boolean isInDB(Item item) {
        return items.contains(item);
    }

    @Override
    public boolean isInDB(Movie movie) {
        return movies.contains(movie);
    }

    @Override
    public boolean isInDB(User user) {
        return users.contains(user);
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
