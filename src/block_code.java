public class block_code {
    public static void main(String[] args) {
        int a = 10;
        {
            a=12;
            int c = 23;
        }
//        c = 23; // anything outside the block code is always not accessable

    }
}
