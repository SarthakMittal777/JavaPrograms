import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        switch (d)
        {
            case 1:
                System.out.println("jello");
                break;
            case 2:
                System.out.println("mello");;
                break;
                default:
                    System.out.println("thankyou");
        }

    }
}
