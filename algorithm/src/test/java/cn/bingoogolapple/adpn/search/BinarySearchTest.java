package cn.bingoogolapple.adpn.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/12 下午12:12
 * 描述:
 */
public class BinarySearchTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void binarySearch() throws Exception {
        int[] arr = new int[]{1, 2, 6, 9, 20, 57};
        int result = BinarySearch.binarySearchWithRecursion(arr, 6);
//        int result = BinarySearch.binarySearchWithoutRecursion(arr, 6);
        System.out.println("result = " + result);
    }

}