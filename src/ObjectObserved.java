import java.util.ArrayList;
import java.util.List;

public class ObjectObserved implements Observed {

    private final List<String> records = new ArrayList<>();

    private final List<Observer> subscribers = new ArrayList<>();

    public void addRecord(String record) {
        this.records.add(record);
        notifyObservers();
    }

    public void removeRecord(String record) {
        this.records.remove(record);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.records);
        }
    }
}
