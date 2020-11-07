package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 16:18
 *
 * @version 1.0
 * @description
 */
public class Cat {

    public int weight;
    public int height;

    public Cat(int weight , int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
