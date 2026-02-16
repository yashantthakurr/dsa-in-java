import java.util.InputMismatchException;
import java.util.Scanner;

public class inverseHalfPyramidWithNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
}
