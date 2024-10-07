import java.util.Scanner;
public class main
{ 
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter a first number");
    int num1=s.nextInt(); 
    System.out.println("enter a first number");
    int num2=s.nextInt(); 
    int hcf=calculatehcf(num1,num2);
    System.out.println("hcf = "+hcf);
    int lcm=(num1*num2)/hcf;
    System.out.println("lcm = "+lcm);
}
    public static int calculatehcf(int num1,int num2)
    {
		while(num2!=0)
		{
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1;
    }
}
