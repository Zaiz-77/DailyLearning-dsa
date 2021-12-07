package com.dsa.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {168, 51, 6, 486, 48, 864, 86, 1, 1, 999};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    // 排序的方法 首先形成堆，然后不断的取出元素
    public static void heapSort(int[] array) {
        setUpHeap(array);

        int temp;

        for(int i = array.length - 1; i > 0; i --){
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // 之后再把大的调上去就行
            createHeap(array, i, 0);
        }
        }

    // 创建一个最大值堆或者最小值堆的方法，这里按照最大值堆
    // n：长度
    public static void createHeap(int[] array, int n, int leafIndex) {
        // 每一次操作的初始化,因为后面会循环调用
        int j = 2 * leafIndex + 1; // 这个j就是用来存那个比较大的孩子结点的下标
        int temp = array[leafIndex]; // 临时保存它的值

        // 不越界的前提下不断循环
        while (j < n){
            // 如果左孩子比右孩子大，那么去右孩子，这一步之后j里面肯定是存的大的的下标j
            if(j < n - 1 && array[j] < array[j + 1]) j++;
            // 然后将temp也就是父节点的值和这个大的比较
            if(temp > array[j]){
                // 确实满足，那么退出
                break;
            } else{
                // 否则更新i，继续操作
                array[leafIndex] = array[j];
                leafIndex = j;
                j = 2 * leafIndex + 1;
            }
        }
        array[leafIndex] = temp;
    }

    // 将一个数组变为大值堆的方法
    // 注意这个方法只能转换为小值或者大值堆，但是这并不一定是有序数组
    public static void setUpHeap(int[] a){
        int n = a.length;
        for(int i = (n - 1) / 2; i >= 0; i --)
            // 就是从第一个非叶子结点开始不断向前构造堆
            createHeap(a, n, i);
    }
}
