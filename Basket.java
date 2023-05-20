import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> eggs = new ArrayList<>();
    private List<Observer> observers = new ArrayList<Observer>();

    public void addEgg(Egg egg) {
        eggs.add(egg);
        notifyObservers();
    }

    private void notifyObservers() {
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addObserver(ChickenObserver chickenObserver) {
    }
}