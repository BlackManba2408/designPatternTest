package com.blackMamba.dp.observer_t1;

/**
 * Created by Black Mamba on 2020/11/10 22:07
 *
 * @version 1.0
 * @description
 */
public interface Observable {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String context);

}
