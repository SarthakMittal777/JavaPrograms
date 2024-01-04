public class Sarthak_Special_Pyramid {
    //WAP to print the following pyramid using loops in java
// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
// 1 2 3 4 5 6 7 6 5 4 3 2 1
// 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
// 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
public static void main(String[] args)
{
    int i,j,k;
   
    for(i=1;i<=9;i++)
    {
     
        for(j=i;j<=9;j++)
        {
            System.out.print("  ");
        }
       // System.out.println();
    
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        for(k=i-1;k>=1;k--)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }

    
}
}
