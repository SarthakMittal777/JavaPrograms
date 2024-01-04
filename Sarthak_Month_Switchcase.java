public class Sarthak_Month_Switchcase {
    //WAP to take input (a number) of a month (1 - 12) and print its equivalent name of the month. (e.g. 1 to Jan, 2 to Feb. 12 to Dec.) Use Scanner class for user input( Hint-use switch case)
public static void main(String[] args)
{
    int n=12;
    switch(n)
    {
        case 1:
        System.out.println("Jan");
        break;
        case 2:
        System.out.println("Feb");
        break;
        case 3:
        System.out.println("Mar");
        break;
        case 4:
        System.out.println("Apr");
        break;
        case 5:
        System.out.println("May");
        break;
        case 6:
        System.out.println("June");
        break;
        case 7:
        System.out.println("July");
        break;
        case 8:
        System.out.println("Aug");
        break;
        case 9:
        System.out.println("Sept");
        break;
        case 10:
        System.out.println("Oct");
        break;
        case 11:
        System.out.println("Nove");
        break;
        case 12:
        System.out.println("Dece");
        break;
        default:
        System.out.println("Invalid Input");
    }
}
