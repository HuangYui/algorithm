package day02_20221204;

import java.util.Arrays;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Code02_SelectSort
 * @Description: 选择排序
 * @date : 2022/12/4 16:21
 */
public class Code02_SelectSort {

    /**
     * 选择排序
     *
     * @param array 待排序数组
     */
    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int minFlag = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minFlag] ) {
                    minFlag = j;
                }
            }
            temp = array[i];
            array[i] = array[minFlag];
            array[minFlag] =temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] sortArray = {6, 9 ,1 , 2, 5, 4, 3, 2, 1};
        sort(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }

}
