package day02_20221204;

import java.util.Arrays;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Code02_BoobSort
 * @Description: 冒泡排序
 * @date : 2022/12/4 16:42
 */
public class Code02_BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array array
     */
    public static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] sortArray = {6, 9 ,1 , 2, 5, 4, 3, 2, 1};
        bubbleSort(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }
}
