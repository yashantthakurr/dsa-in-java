import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {78, 89, 45, 75, 58, 72, 56, 12, 14};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the element to search: ");
            int numToSearch = scanner.nextInt();
            int index = linearSearch(array, numToSearch);

            if (index != -1) {
                System.out.printf("%d found at index: %d\n", numToSearch, index);
            }
            else {
                System.out.printf("%d does not exist in th array!", numToSearch);
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
    private static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return i;
            }
        }
        return -1;
    }
}
