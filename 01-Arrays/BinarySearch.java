import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {12, 15, 19, 23, 26, 29, 35, 37, 45, 48, 56, 67, 78, 89};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number to serach: ");
            int numToSearch = scanner.nextInt();
            int index = binarySearch(array, numToSearch);
            if (index != -1) {
                System.out.printf("%d found at index: %d", numToSearch, index);
            }
            else {
                System.out.printf("%d does not exist in the array!", numToSearch);
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number.");
        }
    }
    private static int binarySearch(int[] a, int n) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == n) {
                return mid;
            }
            else if (a[mid] < n) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
