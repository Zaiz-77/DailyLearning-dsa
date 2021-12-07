package com.dsa.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1,681,681,86,18,15,165,1,651,3,1385,13,51,385,41,631};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    // 快速排序
    public static void quickSort(int[] array, int left, int right){
        if(left < right){
            // 使用自定义方法 获取轴值pivot
            int pivot = getPivot(array, left, right);
            // 左侧快排
            quickSort(array, left, pivot - 1);
            // 右侧快排
            quickSort(array, pivot + 1, right);
        }
    }

    // 获取轴值
    public static int getPivot(int[] array, int left, int right){
        int pivot = array[left];
        while (left < right){
            // 从右侧哨兵去找，直到找到比轴值小的值，将right停下来
            while (left < right && array[right] > pivot) right --;
            array[left] = array[right];

            //现在去左边找，直到找到比轴值大的值，然后left停下来
            while (left < right && array[left] <= pivot) left ++;
            array[right] = array[left];
        }
        // 出while的时候，肯定是left和right相遇了，这时候把我们存的值给拿出来就行了
        array[left] = pivot;
        return left;
    }
}
