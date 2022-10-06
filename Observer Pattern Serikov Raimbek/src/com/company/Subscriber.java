package com.company;

import java.util.List;

public interface Subscriber {
    void handleEvent(List<String> animes);
}
