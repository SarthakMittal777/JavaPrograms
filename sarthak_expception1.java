public class sarthak_expception1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            int element = numbers[3]; 
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

     
        try {
            String str = null;
            int length = str.length(); 
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
