public class Sarthak_find_rotate {
    public static boolean isRotation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        String leftRotation = a.substring(2) + a.substring(0, 2);
        String rightRotation = a.substring(a.length() - 2) + a.substring(0, a.length() - 2);
        
        return leftRotation.equals(b) || rightRotation.equals(b);
    }
    
}
