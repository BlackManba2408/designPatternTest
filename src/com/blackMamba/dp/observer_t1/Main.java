package com.blackMamba.dp.observer_t1;

/**
 * Created by Black Mamba on 2020/11/10 22:26
 *
 * @version 1.0
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Thief thief = new Thief();
        Undercover undercover = new Undercover();
        thief.addObserver(undercover);
        thief.fight();
    }
}
