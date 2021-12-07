package com.dsa.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {156,8541,134,1,4841,16,1163,341};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            // 给定要插入的分解线：当前元素前一个
            int insertIndex = i - 1;
            // 要插入的值，就是当前的元素
            int insertVal = array[i];

            // 不越界，那么下标大于等于0
            // 确实有必要移动：它比前面的小
            while (insertIndex >= 0 && insertVal < array[insertIndex]){
                // 如果真的这样：
                // 后移：那不就是把下标加一对应值改成它自己不就好了
                array[insertIndex + 1] = array[insertIndex];
                // 让它再往前面走，进行下一轮循环
                insertIndex--;
            }
            // 因为这下标，指的一定是插入元素的前一个元素，所以退出循环的时候，就是把本身给本身，也就是不排序
            // 这样不排是真的不排了，排序在while里面
            array[insertIndex + 1] = insertVal;
        }
    }
}
