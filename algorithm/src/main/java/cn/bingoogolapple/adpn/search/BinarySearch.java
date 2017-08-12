package cn.bingoogolapple.adpn.search;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/12 上午11:59
 * 描述:二分查找
 */
public class BinarySearch {
    private BinarySearch() {
    }

    /**
     * 递归二分查找
     *
     * @param arr  递增数组
     * @param dest 要查找的值
     * @return 要查找的值的索引，如果没找到则返回 -1
     */
    public static final int binarySearchWithRecursion(int[] arr, int dest) {
        if (arr == null) {
            throw new IllegalArgumentException("arr 不能为 null");
        }

        return binarySearch(arr, dest, 0, arr.length - 1);
    }

    /**
     * 递归二分查找
     *
     * @param arr  递增数组
     * @param dest 要查找的值
     * @param low  此次查找索引范围的低位
     * @param high 此次查找索引范围的高位
     * @return 要查找的值的索引，如果没找到则返回 -1
     */
    private static final int binarySearch(int[] arr, int dest, int low, int high) {
        if (low <= high) {
            int centerIndex = (low + high) / 2;
            int centerValue = arr[centerIndex];
            if (dest == centerValue) {
                return centerIndex;
            } else if (dest < centerValue) {
                return binarySearch(arr, dest, low, centerIndex - 1);
            } else {
                return binarySearch(arr, dest, centerIndex + 1, high);
            }
        } else {
            return -1;
        }
    }

    /**
     * 非递归二分查找
     *
     * @param arr  递增数组
     * @param dest 要查找的值
     * @return 要查找的值的索引，如果没找到则返回 -1
     */
    public static final int binarySearchWithoutRecursion(int[] arr, int dest) {
        if (arr == null) {
            throw new IllegalArgumentException("arr 不能为 null");
        }

        int low = 0;
        int high = arr.length;
        int centerIndex;
        int centerValue;
        while (low <= high) {
            centerIndex = (low + high) / 2;
            centerValue = arr[centerIndex];
            if (dest == centerValue) {
                return centerIndex;
            } else if (dest < centerValue) {
                high = centerIndex - 1;
            } else {
                low = centerIndex + 1;
            }
        }
        return -1;
    }
}
