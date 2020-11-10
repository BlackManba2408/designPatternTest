package com.blackMamba.dp.observer_t1;

/**
 * Created by Black Mamba on 2020/11/10 22:15
 *
 * @version 1.0
 * @description
 */
public class Undercover implements Observer{

    @Override
    public void update(String context) {
        arrest(context);
    }

    private void arrest(String context){
        System.out.println("卧底告诉警察："+context);
        System.out.println("警察出警逮捕他们！！！");
    }
}
