public class decimal_code {
    public static void main(String[] args) {
        int a= 102367;
        convert(a);

    }
   static void convert(int num)
    {
        int mod=0;

        while(num>1)
        {
            mod= num%2;
            System.out.println(mod);
            num=num/2;
        }
    }
}
