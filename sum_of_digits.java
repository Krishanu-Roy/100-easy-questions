import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,n;
        System.out.println("Enter the number : ");
        n=num=sc.nextInt();
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println("The sum of the number : "+n+" is "+sum);

        //using recursion method
        System.out.println("The sum of the digits "+getsum(num,sum));

        //using string
        String num1="12345";
        int count1=0;
        for(int i=0;i<num1.length();i++)
        {
            count1+=Integer.parseInt(String.valueOf(num1.charAt(i)));
        }
        System.out.println(count1);
    }
    static int getsum(int num,int sum)
    {
        if(num==0)
            return sum;
        sum+=num%10;
        return getsum(num/10, sum);

    }
}
