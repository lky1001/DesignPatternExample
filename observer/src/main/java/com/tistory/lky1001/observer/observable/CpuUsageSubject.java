package com.tistory.lky1001.observer.observable;

import com.tistory.lky1001.observer.common.Observer;
import com.tistory.lky1001.observer.common.Subject;

import java.util.ArrayList;

/**
 * Created by lee on 2016. 8. 17..
 */
public class CpuUsageSubject implements Subject {

    private ArrayList<Observer> observers;
    private float usage;

    public CpuUsageSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(usage);
        }
    }

    public void cpuUsageChanged() {
        notifyObservers();
    }

    public void setCpuUsage(float usage) {
        this.usage = usage;
        cpuUsageChanged();
    }
}
