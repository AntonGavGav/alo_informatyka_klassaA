package observator;

import java.util.HashSet;
import java.util.Set;

import static observator.EventType.*;

public class CricketData implements Subject{
    private int runs;
    private int wickets;
    private float overs;
    private Set<Observer> observers = new HashSet<>();


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers(Event event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void setRuns(int runs) {
        this.runs = runs;
        notifyObservers(new Event(RUNS, runs));
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
        notifyObservers(new Event(WICKETS, wickets));
    }

    public void setOvers(float overs) {
        this.overs = overs;
        notifyObservers(new Event(OVERS, overs));
    }
}
