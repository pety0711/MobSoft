package mobsoft.interactor.favourites;

import android.app.usage.UsageEvents;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import mobsoft.MobSoftApplication;
import mobsoft.interactor.favourites.event.GetFavouritesEvent;
import mobsoft.interactor.favourites.event.RemoveFavouriteEvent;
import mobsoft.interactor.favourites.event.SaveFavouriteEvent;
import mobsoft.model.Item;
import mobsoft.repository.Repository;

/**
 * Created by petys on 2017. 04. 21..
 */

public class FavouritesInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus bus;

    public FavouritesInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void getFavourites() {
        GetFavouritesEvent event = new GetFavouritesEvent();
        try {
            List<Item> items = repository.getFavourites();
            event.setItems(items);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveFavourite(Item item) {

        SaveFavouriteEvent event = new SaveFavouriteEvent();
        event.setItem(item);
        try {
            repository.addFavourite(item);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateFavourites(List<Item> items) {
        try {
            repository.updateFavourites(items);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeFavourite(Item item) {
        RemoveFavouriteEvent event = new RemoveFavouriteEvent();
        event.setItem(item);
        try {
            repository.removeFavourite(item);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
