import java.util.Scanner;
public class num
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        System.out.println("binary = "+Integer.toBinaryString(num));
        System.out.println("octal = "+Integer.toOctalString(num));
        System.out.println("hexadecimal = "+Integer.toHexString(num));
    }
}





