import java.util.InputMismatchException;
import java.util.Scanner;

public class hollowSquarePattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of stars on sides: ");
            int starsOnSides = scanner.nextInt();

            for (int i = 1; i <= starsOnSides; i++) {
                for (int j = 1; j <= starsOnSides; j++) {
                    if (i == 1 || j == 1 || i == starsOnSides || j == starsOnSides) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter a number!");
        }
    }
}
