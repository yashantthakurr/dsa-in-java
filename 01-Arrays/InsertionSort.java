public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {78, 89, 47, 45, 76, 15, 24, 86, 35};
        System.out.println("Unsorted Array: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        insertionSort(array);

        System.out.println("\nSorted Array: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
