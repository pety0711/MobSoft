package mobsoft.model;

/**
 * Created by mobsoft on 2017. 03. 27..
 */

public class Item {

    private int ID;
    private String title;
    private String imageURL;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
