package com.blackMamba.dp.strategy;

/**
 * Created by Black Mamba on 2020/9/6 17:41
 *
 * @version 1.0
 * @description
 */
public class SorterV1 {

    public void sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                minIndex = arr[j] < arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }

    }

    private void swap(int[] arr, int i, int minIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
