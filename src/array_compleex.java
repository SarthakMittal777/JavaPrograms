public class array_compleex {
    public static void main(String[] args) {
        int i,j,c=0;
        int[] arr={22,22,33,2,33};
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                if(arr[i]==arr[j])
                {
                    c=c+1;
                    System.out.println(c);
                }
//                if(c==1)
//                {
//                    System.out.println(arr[j]);
//                }
            }
        }
    }


}

