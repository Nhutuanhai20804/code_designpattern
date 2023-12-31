import java.util.ArrayList;
import java.util.List;
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
