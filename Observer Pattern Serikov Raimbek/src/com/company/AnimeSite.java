package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimeSite implements Publisher {

    List<Subscriber> subscribers = new ArrayList<>();
    List<String> animes = new ArrayList<>();


    public void addAnime(String anime) {
    animes.add(anime);
    notifyAllObservers();
    }

    public void removeAnime(String anime) {
    this.animes.remove(anime);
    notifyAllObservers();
    }

    @Override
    public void addObserver(Subscriber subscriber) {
    subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
    subscribers.remove(subscribers);
    }

    @Override
    public void notifyAllObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.handleEvent(animes);
        }
    }
}
