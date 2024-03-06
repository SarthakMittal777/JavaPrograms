import java.util.Scanner;

public class sarthak_exeception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
a
        try {
            if (number < 10 || number > 50) {
                throw new Exception("Number out of range");
            } else {
                int square = number * number;
                System.out.println("Square of the number: " + square);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
