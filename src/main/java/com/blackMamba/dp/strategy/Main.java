package com.blackMamba.dp.strategy;

import java.util.Arrays;

/**
 * Created by Black Mamba on 2020/9/6 17:08
 *
 * @version 1.0
 * @description
 *      策略模式
 *          1、使用场景：同一个动作有多个选择，例如汽车的有经济模式、运动模式等，坦克开火时一次一发炮弹、一次两发炮弹等
 *
 */
public class Main {

    public static void main(String[] args) {
        // SorterV1测试版本
//        int[] arr = {12,23,2,5,3,67,9,34};
//        SorterV1 sorter = new SorterV1();
//        sorter.sort(arr);

        // SorterV2测试版本
//        Dog[] arr = {new Dog(25),new Dog(20),new Dog(35)};
//        SorterV2 sorter = new SorterV2();
//        sorter.sort(arr);

        // SorterV3测试版本
        Cat[] arr = {new Cat(25,15),new Cat(15,30),new Cat(35,25)};
        SorterV3 sorter = new SorterV3();
        //sorter.sort(arr,new WeightComparator());
        sorter.sort(arr,new HeightComparatorV1());

        System.out.println(Arrays.toString(arr));
    }
}
