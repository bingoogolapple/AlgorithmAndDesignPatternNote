/**
 * Created by bingoogolapple on 16/8/7.
 */
public class SortUtil {

    private SortUtil() {
    }

    /**
     * 选择排序
     * 外层循环的索引 i 从 0 到 count - 2
     * 内层循环的索引 j 从 i + 1 到 count - 1
     * 每次开始内层循环时,将 i 作为最小值的索引,通过内循环找出 i 到 count - 1 中最小值的索引位置 minIndex
     * 每次内循环结束后交换索引 i 和 minIndex 对应的值
     *
     * @param array
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    /**
     * 插入排序
     * 从数组的第二个元素开始循环，将选中的元素与之前的元素一一比较,如果选中的元素小于之前的元素，则将之前的元素后移，最后再将选中的元素放在合适的位置。
     * 在这个算法执行的过程中，总是保持着索引i之前的数组是升序排列的。
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
    }

}