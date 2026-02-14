import java.util.*;
public class ArrayTraversal {
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

            System.out.println("You entered the following array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
}
