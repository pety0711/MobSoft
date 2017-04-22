package mobsoft.model;

import com.orm.dsl.Table;

import java.util.List;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

@Table
public class Movie {
    private Long id = null;
    private String title;
    private String imageURL;
    private String description;
    private List<String> actors;
    private Long ItemId = null;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return ItemId;
    }

    public void setItemId(Long itemId) {
        ItemId = itemId;
    }
}
