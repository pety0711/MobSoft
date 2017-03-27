package mobsoft.model;

import java.util.List;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class Movie {
    private int ID;
    private String title;
    private String imageURL;
    private String description;
    private List<String> actors;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public int getID() {

        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getActors() {
        return actors;
    }
}
