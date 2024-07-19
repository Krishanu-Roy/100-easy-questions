import java.util.Scanner;

public class primt_numberuptoarange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lowerRange,upperRange,count=0;
        System.out.println("Enter the lowerRange and UpperRange to check for prime number : ");
        lowerRange=sc.nextInt();
        upperRange=sc.nextInt();
        for(int i=lowerRange;i<=upperRange;i++)
        {
            if(isPrime(i))
                System.out.print(i);
                System.out.print(" ");
        }
    }
    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
            
        return true;
    }
}

