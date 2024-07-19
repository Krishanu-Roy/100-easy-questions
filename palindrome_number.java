
import java.util.Scanner;
public class palindrome_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,rev=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        boolean isNeg=num<0?true:false;
        if(isNeg)
        {
            System.out.print("-");
            num=num*-1;

        }
        if(getReverse(num, rev)==num)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not an palindrome number ");
    }
    static int getReverse(int num,int rev)
    {
        if(num==0)
            return rev;
        
        rev=rev*10+num%10;

        return getReverse(num/10,rev);
        
        
    }
}
