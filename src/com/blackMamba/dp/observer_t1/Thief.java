package com.blackMamba.dp.observer_t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Black Mamba on 2020/11/10 22:13
 *
 * @version 1.0
 * @description
 */
public class Thief implements Observable,IThief {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void scrounge() {
        System.out.println("小偷偷东西ing");
        String context = "小偷要偷东西了";
        this.notifyObservers(context);
    }

    @Override
    public void fight() {
        System.out.println("小偷打架ing");
        String context = "小偷要偷打架了";
        this.notifyObservers(context);
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer o : observers){
            o.update(context);
        }
    }
}
