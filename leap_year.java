import java.util.Scanner;
public class leap_year{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year :");
        year=sc.nextInt();

        if(year%400 == 0 || (year%4==0 && year%100 !=0))
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is not a leap year.");
    }
}