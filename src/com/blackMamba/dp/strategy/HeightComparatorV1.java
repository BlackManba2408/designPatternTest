package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 18:04
 *
 * @version 1.0
 * @description
 */
public class HeightComparatorV1 implements ComparatorV1<Cat> {

    @Override
    public int compareTo(Cat t1, Cat t2) {
        if(t1.height > t2.height) return 1;
        else if(t1.height < t2.height) return -1;
        else return 0;
    }
}
