package com.dsa.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] array = {1,641,987,4,341,384,1685,168,468,168,1635,15,1,8641,3841,11,9999999};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    // 把已经排好的元素拿出来的方法
    // 规定左侧指针，右侧指针，右侧边界
    public static void merge(int[] array, int left, int right, int rightBound){
        int i = left;
        int j = right;
        int mid = right - 1;

        // 初始化额外数组的原始下标
        // 以及初始化额外数组
        int k = 0;
        int[] tempArray = new int[rightBound - left];

        // 不断地归并，每一次k必定加，但是i和j就不一样，谁小谁加，也就是后移
        while (i <= mid && j < rightBound){
            if(array[i] <= array[j]){
                tempArray[k] = array[i];
                i++;
            }else {
                tempArray[k] = array[j];
                j++;
            }
            k++;
        }

        // 看看有没有多余的，然后全部给到tempArray中，注意这个语法
        while (i <= mid) tempArray[k++] = array[i++];
        while (j < rightBound) tempArray[k++] = array[j++];

        // 还给我们需要排的数组
        for(int m = 0; m < tempArray.length;m++) array[m] = tempArray[m];
    }

    // 排序的方法
    public static void mergeSort(int[] array, int leftSide, int rightSide){
        if(leftSide == rightSide) return;
        // 首先分割
        int mid = leftSide + (rightSide - leftSide) / 2;

        // 左侧排序
        mergeSort(array, 0, mid);

        // 右侧排序
        mergeSort(array, mid + 1, rightSide);

        // 归并
        merge(array, 0, mid, array.length);
    }
}
