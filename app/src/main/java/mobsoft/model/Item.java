package mobsoft.model;

import com.orm.dsl.Table;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

@Table
public class Item {

    private Long id = null;
    private String title;
    private String imageURL;
    private Long MovieID = null;

    public Item() {}

    public Item(Long id, String title, String imageURL) {
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
    }

    public Long getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setID(Long ID) {
        this.id = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getMovieID() {
        return MovieID;
    }

    public void setMovieID(Long movieID) {
        MovieID = movieID;
    }
}
