import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(checkPrime(num))
            System.out.println("Prime number");
        else
            System.out.println("Not an prime number");

    }
    static boolean checkPrime(int n)
    {
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0 && n!=1)
            return true;
        
        return false;
    }
}
