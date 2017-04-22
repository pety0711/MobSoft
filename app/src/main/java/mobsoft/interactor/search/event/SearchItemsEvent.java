package mobsoft.interactor.search.event;

import java.util.List;

import mobsoft.interactor.search.SearchInteractor;
import mobsoft.model.Item;

/**
 * Created by petys on 2017. 04. 21..
 */

public class SearchItemsEvent {
    private int code;
    private List<Item> items;
    private Throwable throwable;

    public SearchItemsEvent() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
