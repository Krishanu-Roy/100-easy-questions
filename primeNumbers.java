import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number : ");
        number=sc.nextInt();
        
        //Simple Iteration technique
        if(number<2)
        {
            System.out.println("The number "+number+" is not prime.");
            System.exit(0);
        }
        int count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                count++;
        }
        if(count>2)
        {
            System.out.println("The number "+number+" is not prime.");
        }
        else{
            System.out.println("The number "+number+" is a prime.");
        }

        //Optimization by break down
        boolean isprime=true;
        if(number<2)
        {
            isprime=false;
        }
        else
        {
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        String result = isprime? "Prime number":"Not a prime number";
        System.out.println("The number "+number+" is "+result);

        //Iteration from[2,n/2]
        if(number<2)
        {
            isprime=false;
        }
        else{
            for(int i=2;i<=number/2;i++)
            {
                if(number%i==0)
                    isprime=false;
                    break;
            }
        }
        String result1=isprime?" is Prime number":" not a prime number";
        System.out.println("The number "+number+" is "+result);

        
    }
}
