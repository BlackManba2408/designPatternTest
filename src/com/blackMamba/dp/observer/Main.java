package com.blackMamba.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Black Mamba on 2020/11/8 16:37
 *
 * @version 1.0
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Children c= new Children();
        c.wakeUp();
    }
}

class Children{
    boolean cry = false;
    List<Observer> observerLists = new ArrayList<Observer>();

    {
        observerLists.add(new Father());
        observerLists.add(new Mother());
    }

    public void wakeUp(){
        System.out.println("WUWUWUWUWUWU...");
        cry = true;

        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(),"bed",this);
        for (Observer observer: observerLists) {
            observer.actionOnWakeUp(event);
        }
    }

    public boolean isCry(){
        return cry;
    }

}

class Father implements Observer{
    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}

class Mother implements Observer{
    public void hug(){
        System.out.println("mam hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

class WakeUpEvent{
    long timestamp;
    String loc;
    Object source;

    public WakeUpEvent(long timestamp , String loc , Object source){
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

interface Observer{
    void actionOnWakeUp(WakeUpEvent event);
}
