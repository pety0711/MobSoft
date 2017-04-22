package mobsoft.interactor.search;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import mobsoft.MobSoftApplication;
import mobsoft.interactor.search.event.SearchItemsEvent;
import mobsoft.model.Item;
import mobsoft.repository.MemoryRepository;
import mobsoft.repository.Repository;
import mobsoft.repository.SugarOrmRepository;

/**
 * Created by petys on 2017. 04. 21..
 */

public class SearchInteractor {

    @Inject
    private Repository repository;

    @Inject
    EventBus bus;

    public SearchInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void searchItems(String search) {
        SearchItemsEvent event = new SearchItemsEvent();
        try {
            List<Item> items = repository.getItemsAll();
            if (search.isEmpty()) {
                event.setItems(items);
            }
            else {
                List<Item> result = new ArrayList<>();
                for (Item item: items) {
                    if (item.getTitle().contains(search)) {
                        result.add(item);
                    }
                }
                event.setItems(result);
            }
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
