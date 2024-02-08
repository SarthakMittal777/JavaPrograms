public class Sarthak_buffer_class {
    public static void main(String[] args) {
        String str = "Sarthak";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String reversedStr = sb.toString();
        
        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
