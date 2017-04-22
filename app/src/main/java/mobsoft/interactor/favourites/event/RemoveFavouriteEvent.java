package mobsoft.interactor.favourites.event;

import mobsoft.model.Item;

/**
 * Created by petys on 2017. 04. 21..
 */

public class RemoveFavouriteEvent {
    private int code;
    private Item item;
    private Throwable throwable;

    public RemoveFavouriteEvent() {
    }

    public RemoveFavouriteEvent(int code, Item item, Throwable throwable) {
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

}