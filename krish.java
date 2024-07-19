import java.util.Scanner;
public class krish
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        //checking positive negative
        if(num>0)
            System.out.println(" The number is postive : "+ num);
        else
            System.out.println("The number is negative : "+num);

        // checking even or odd
        if(num%2==0)
            System.out.println("The number "+num+" is even");
        else
            System.out.println("The number "+num+" is odd");

        // sum of first n natural numbers
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+num+" natural numbers is "+ sum);

        // greatest of 2 numbers
        System.out.println("Enter 2 numbers :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
            System.out.println(num1+" is greater than "+num2);
        else
            System.out.println(num2+" is greater than "+num1);

        // greatest of 3 numbers 
        System.out.println("Enter 3 numbers :");
        int num12=sc.nextInt();
        int num22=sc.nextInt();
        int num23=sc.nextInt();
        if(num12>num22 && num22>num12)
        {
            System.out.println(num12+" is greater" );
            if(num22>num12 && num12 >num23)
                System.out.println(num22+" is greater" );
        }
        System.out.println(num23+" is greater");
    }
}