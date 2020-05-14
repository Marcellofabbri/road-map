package eu.marcellofabbri.roadmap.presenter;

public class EventPresenter {
    public static EventView view;

    public EventPresenter(EventView view) {
        this.view = view;
    }

    public interface EventView {
        void updateInfoTextView();
    }

}
