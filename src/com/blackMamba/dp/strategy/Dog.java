package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 16:23
 *
 * @version 1.0
 * @description
 */
public class Dog implements ComparableV1 {
    public int weight;

    public Dog(int weight){
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        Dog d = (Dog)o;
        if(this.weight > d.weight) return 1;
        else if(this.weight < d.weight) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
