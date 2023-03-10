package Sort;

import java.util.Arrays;

public class SortUtils {
    public static void main(String[] args) {
        int[] arr = bubbleSort(new int[]{3, 1, 2, 3, 5, 0, 8});
        int[] arr2 = choiceSort(new int[]{3, 1, 2, 3, 5, 0, 8});
//        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                count++;
            }
        }
        System.out.println("count = " + count);
        return arr;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] choiceSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
                count++;
            }
            int tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;
        }
        System.out.println("count = " + count);
        return arr;
    }
}
