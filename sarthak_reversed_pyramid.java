public class sarthak_reversed_pyramid {
    public static void main(String[] args)
    {
        int i;
        int j;
        for (i=1;i<=5;i++)
        {
            for (j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
