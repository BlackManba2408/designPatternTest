package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 16:53
 *
 * @version 1.0
 * @description
 *     选择排序
 */
public class SorterV2 {

    public void sort(Dog[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                minIndex = arr[j].compareTo(arr[minIndex]) == -1?j:minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private void swap(Dog[] arr, int i, int minIndex) {
        Dog temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
