public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 6, 3, 8, 7};
        printArray("排序前:", array);
        SortUtil.selectionSort(array);
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
