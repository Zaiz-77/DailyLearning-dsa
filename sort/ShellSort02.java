package com.dsa.sort;

import java.util.Arrays;

// 位移式shell sort
// 就是真的分组然后插入
public class ShellSort02 {
    public static void main(String[] args) {
        int[] array = {43, 5, 47, 1, 19, 11, 59, 15, 48, 41};
        shellSort02(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort02(int[] array) {
        // 计算出knuth序列的间隔数值最大值
        int h = 1;
        while (h <= array.length / 3){
            h = 3 * h + 1; // knuth array
        }

        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < array.length; i++) {
                // 我们既然定义了这个值，肯定是之前的值使用收到了限制
                int insertVal = array[i];
                int insertIndex = i - gap;
                // 在判断中，使用的是Val和Index坐标
                while (insertIndex >= 0 && insertVal < array[insertIndex]) {
                    array[insertIndex + gap] = array[insertIndex];
                    insertIndex -= gap;
                }
                array[insertIndex + gap] = insertVal;
            }
        }
    }
}
