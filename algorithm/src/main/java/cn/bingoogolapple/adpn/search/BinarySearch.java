package cn.bingoogolapple.adpn.search;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/12 上午11:59
 * 描述:二分查找
 */
public class BinarySearch {
    private BinarySearch() {
    }

    public static final int binarySearch(int[] arr, int dest, int low, int high) {
        if (arr == null || low < 0 || high >= arr.length) {
            throw new IllegalArgumentException("非法参数");
        }

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
}
