package mobsoft.interactor.favourites.event;

import mobsoft.model.Item;

/**
 * Created by petys on 2017. 04. 21..
 */

public class SaveFavouriteEvent {
    private int code;
    private Item item;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public SaveFavouriteEvent() {
    }

    public SaveFavouriteEvent(int code, Item item, Throwable throwable) {
        this.code = code;
        this.item = item;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    //</editor-fold>
}

