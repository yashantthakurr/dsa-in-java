import java.util.*;
public class GreatestAndLowestElement {
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

            int max = array[0];
            int min = array[0];

            System.out.println("Entered array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }

            System.out.printf("\nGreatest element of the array is: %d", max);
            System.out.printf("\nLowest element of the array is: %d", min);
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
}
