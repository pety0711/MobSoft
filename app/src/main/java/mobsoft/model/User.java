package mobsoft.model;

import com.orm.dsl.Table;

import java.util.List;

/**
 * Created by petys on 2017. 04. 20..
 */

@Table
public class User {
    private Long id = null;
    private String name;
    private String password;
    private List<Item> favourites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Item> favourites) {
        this.favourites = favourites;
    }

    public void addFavourite(Item item) {
        this.favourites.add(item);
    }

    public void removeFavourite(Item item) {
        this.favourites.remove(item);
    }

    public void removeFavourite(Long id) {
        for (Item item: favourites) {
            if (item.getID() == id) {
                favourites.remove(item);
                break;
            }
        }
    }
}
