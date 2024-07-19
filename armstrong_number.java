import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number :");
        num=sc.nextInt();
        int len=lengt(num);

        if(armstrong(num, len))
            System.out.println("Armstring number");
        else
            System.out.println("Not an armstrong number");

    }
    static int lengt(int num)
    {
        int len=0;
        while(num!=0)
        {
            len++;
            num/=10;
        }
        return len;
    }
    static boolean armstrong(int num,int len)
    {
        int sum=0,temp,digit;
        temp=num;
        while(temp!=0)
        {
            digit = temp%10;
            sum+=Math.pow(digit,len);
            temp=temp/10;
        }
        return sum==num;
    }
}
