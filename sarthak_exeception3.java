public class sarthak_exeception3 {
    public static void main(String[] args) {
        int number = 5;
        try {
            checkEven(number);
            System.out.println("Number is even");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Number is odd");
        }
    }
}
