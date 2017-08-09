package cn.bingoogolapple.adpn.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:34
 * 描述:
 */
public class SortTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertSort() throws Exception {
        int[] array = {5, 2, 6, 3, 8, 7};
        printArray("排序前:", array);
        InsertSort.insertSort(array);
        printArray("排序后:", array);
    }

    @Test
    public void selectionSort() throws Exception {
        int[] array = {5, 2, 6, 3, 8, 7};
        printArray("排序前:", array);
        SelectionSort.selectionSort(array);
        printArray("排序后:", array);
    }

    private static void printArray(String prefix, int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }
        System.out.println(prefix + sb.toString());
    }
}