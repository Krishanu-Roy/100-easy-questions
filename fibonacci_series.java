import java.util.Scanner;

public class fibonacci_series {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        int n1=0,n2=1,nextTerm;
        
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++)
        {
            nextTerm=n1+n2;
            n1=n2;
            n2=nextTerm;
            System.out.print(nextTerm+" ");
        }

    }
}
