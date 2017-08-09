package cn.bingoogolapple.adpn.sort;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:32
 * 描述:选择排序
 */
public class SelectionSort {
    private SelectionSort() {
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
}
