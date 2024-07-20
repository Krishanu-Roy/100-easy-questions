import java.util.Scanner;
public class powerOfNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,exp;
        System.out.println("Enter the base and the exponent : ");
        base=sc.nextInt();
        exp=sc.nextInt();
        System.out.println("The power of the number "+baseToPower(base,exp));
    }
    static int baseToPower(int b,int e)
    {
        if(e==0)
            return 1;
        
        return (b*baseToPower(b, e-1));
    }
}