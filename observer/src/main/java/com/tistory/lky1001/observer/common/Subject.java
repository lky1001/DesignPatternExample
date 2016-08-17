package com.tistory.lky1001.observer.common;

/**
 * Created by lee on 2016. 8. 17..
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
