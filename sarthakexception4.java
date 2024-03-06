public class sarthakexception4 {
    public static void main(String[] args) {
        String input = "Hello World";
        try {
            checkVowels(input);
            System.out.println("String contains vowels");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("String does not contain vowels");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
