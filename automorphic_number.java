import java.util.Scanner;

public class automorphic_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        int s=num*num;
        if(num==s%10)
        {
            System.out.println("Automorphic number ");
        }
        else
        {
            System.out.println("Not an Automorphic Number ");
        }
    }
}
