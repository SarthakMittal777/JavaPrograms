public class shadows {
    static int x =45;
    public static void main(String[] args) {
        System.out.println(x);
        x=34; // here the value got replaced by the value of lower scope i.e 34
        System.out.println(x);

    }
}
