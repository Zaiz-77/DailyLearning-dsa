package com.dsa.sort;

import java.util.Arrays;

/*
冒泡排序
依次比较相邻两个元素，某一个大/小，根据情况而定，就交换他们的位置
下一轮就从下一个元素开始即可
O(N^2)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {156, 16, 16851, 516, 1, 13, 15, 131};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 更改这里的大小关系 就能实现正序和逆序
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
