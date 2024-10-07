import java.util.Scanner;
public class mergearray
{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
    int array1[]=new int[5];
    int array2[]=new int[5];
    System.out.println("enter the elements of array1");
    for(int i=0;i<5;i++)
    {
        array1[i]=s.nextInt();
    }
    System.out.println("enter the elements of array2");
    for(int i=0;i<5;i++)
    {
        array2[i]=s.nextInt();
    }
    System.out.println("merge array");
    for(int i=0;i<5;i++)
    {
        System.out.println(array1[i]+"");
    }
    for(int i=0;i<5;i++)
    {
        System.out.println(array2[i]+"");
    }
}
    }
