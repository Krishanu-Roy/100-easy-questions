import java.util.Scanner;

public class pallindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number :");
        num=sc.nextInt();
        if(isPalindromeNumber(num))
            System.out.println("Palindrome number : "+num);
        else
            System.out.println("Not a Palindrome number : "+num);
    }
    static boolean isPalindromeNumber(int n)
    {
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        return (rev==n);
    }
}
