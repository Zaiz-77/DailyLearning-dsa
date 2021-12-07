package com.dsa.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {15, 1, 3255, 18, 186, 43, 48, 1, 813, 48};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 假设最小值标签和最小值
            int minIndex = i;
            int min = array[i];
            // 找到最小值的位置，实际上是把标签指给那个值
            for (int j = i + 1; j < array.length; j++) {
                // 改变这里的符号，就可以实现逆序
                if (min > array[j]) {
                    minIndex = j;
                    min = array[j];
                }
            }
            // 判断它是不是i，如果不是，说明我们最开始假设错了，那么交换
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
