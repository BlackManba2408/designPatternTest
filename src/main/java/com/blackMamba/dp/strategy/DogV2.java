package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 16:23
 *
 * @version 1.0
 * @description
 */
public class DogV2 implements ComparableV2<DogV2> {
    public int weight;

    public DogV2(int weight){
        this.weight = weight;
    }

    @Override
    public int compareTo(DogV2 d) {
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
