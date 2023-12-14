import java.util.Scanner;

public class pattern_basic {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
