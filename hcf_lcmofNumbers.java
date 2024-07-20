import java.util.Scanner;

public class hcf_lcmofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("HCF of 2 numbers "+hcfofNumber(num1, num2));
        System.out.println("HCF of 2 numbers "+lcmofNumber(num1, num2));
    }
    static int hcfofNumber(int a,int b)
    {
        if(b==0)
            return a;
        return hcfofNumber(b, a%b);
    }
    static int lcmofNumber(int a,int b)
    {
        if(b==0)
            return a;
        return (a/hcfofNumber(a, b))*b;
    }
}
