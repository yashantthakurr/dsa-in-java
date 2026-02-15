import java.util.InputMismatchException;
import java.util.Scanner;

public class invertedRightTrianglePattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = i; j <= rows; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
}
