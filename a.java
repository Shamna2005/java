import java.util.Scanner;
class a
{
    public static void main(String args[])
    {
    int a[]=new int [10];
    Scanner s=new Scanner(System.in);
    System.out.println("enter the array");
    for(int i=0;i<10;i++)
    {
        a[i]=s.nextInt();
    }
     for(int i=0;i<10;i++)
     {
     for(int j=i+1;j<10;j++)
     {
		 if(a[i]>a[j])
		 {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		}
	}
	 System.out.println("sorted array");
	for(int i=0;i<10;i++)
     {
   System.out.println(a[i]);
	 }
	 int max=a[9];
     int min=a[0];
	int smax=a[8];
     System.out.println("smallest element= "+min);
     System.out.println("largest element= "+max);
     System.out.println("second smallest element= "+smax);
 }
}
