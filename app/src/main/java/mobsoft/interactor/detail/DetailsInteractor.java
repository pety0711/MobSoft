package mobsoft.interactor.detail;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import mobsoft.MobSoftApplication;
import mobsoft.interactor.detail.event.GetMovieEvent;
import mobsoft.interactor.favourites.event.RemoveFavouriteEvent;
import mobsoft.interactor.favourites.event.SaveFavouriteEvent;
import mobsoft.model.Item;
import mobsoft.model.Movie;
import mobsoft.model.User;
import mobsoft.repository.Repository;

/**
 * Created by petys on 2017. 04. 21..
 */

public class DetailsInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus bus;

    private User user;

    public DetailsInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void GetMovie(Item item) {
        GetMovie(item.getMovieID());
    }

    public void GetMovie(Long id) {
        GetMovieEvent event = new GetMovieEvent();
        try {
            Movie movie = repository.getMovieByID(id);
            event.setMovie(movie);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void SaveFavourite(Item item) {
        SaveFavouriteEvent event = new SaveFavouriteEvent();
        event.setItem(item);
        try {
            repository.addFavourite(user, item);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void removeFavourite(Item item) {
        RemoveFavouriteEvent event = new RemoveFavouriteEvent();
        event.setItem(item);
        try {
            repository.removeFavourite(user, item);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }



}
