package com.company;

public interface Publisher {
    void addObserver(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void notifyAllObservers();
}
