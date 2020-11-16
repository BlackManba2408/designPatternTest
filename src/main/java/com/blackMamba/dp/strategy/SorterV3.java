package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 18:06
 *
 * @version 1.0
 * @description
 */
public class SorterV3<T> {

    public void sort(T[] arr, ComparatorV1<T> comparator){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                minIndex = comparator.compareTo(arr[j],arr[minIndex]) == -1?j:minIndex;
            }
            swap(arr,i,minIndex);
        }

    }

    private void swap(T[] arr, int i, int minIndex) {
        T temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }

}
