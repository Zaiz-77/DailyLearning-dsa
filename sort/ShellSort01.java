package com.dsa.sort;

import java.util.Arrays;

// 交换式的shell sort
public class ShellSort01 {
    public static void main(String[] args) {
        int[] array = {1651, 31, 381, 1, 5, 418, 4, 861, 351, 1523};
        shellSort01(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort01(int[] array) {
        // 每一次循环步长都要减少，我们这时候就按照每次折半
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            // 每一个步长下，对应一个选择排序，只不过比较的元素只限于array[j]和array[j + gap]
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (array[j + gap] < array[j]) {
                        int temp = array[j];
                        array[j] = array[j + gap];
                        array[j + gap] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
