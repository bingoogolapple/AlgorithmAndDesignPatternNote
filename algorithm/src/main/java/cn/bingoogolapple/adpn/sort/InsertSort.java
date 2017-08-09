package cn.bingoogolapple.adpn.sort;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:32
 * 描述:插入排序
 */
public class InsertSort {
    private InsertSort() {
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
