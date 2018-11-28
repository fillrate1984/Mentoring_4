package com;

import com.interfaces.Observable;
import com.interfaces.Observer;

import java.util.HashSet;

public class Lifecycle implements Observable {

    HashSet<Observer> observers = new HashSet<>();

    public void startLifecycle() {
        for (int i = 0; i < 48; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("---------------Month %d passed---------------\n", i);
            notifyAllObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        if (observers.size() == 0) {
            System.out.println("You should set at least 1 observer first!");
            return;
        }
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }

}
