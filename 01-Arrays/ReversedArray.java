import java.util.*;

public class ReversedArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many elements you want to enter: ");
            int numOfItems = scanner.nextInt();
            int[] array = new int[numOfItems];
            int index = 0;

            while (index < array.length) {
                try {
                    System.out.printf("Enter the element at index %d: ", index);
                    int number = scanner.nextInt();
                    array[index] = number;
                    index++;
                }
                catch (InputMismatchException e) {
                    System.out.println("You should enter a number!");
                    scanner.next();
                }
            }

            System.out.println("Original Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println("\nReversed Array: ");
            reverseArray(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
    private static void reverseArray(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }
}
