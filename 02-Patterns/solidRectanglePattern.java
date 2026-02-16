import java.util.InputMismatchException;
import java.util.Scanner;

public class solidRectanglePattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
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
