class reverse
{
	int num;
	reverse(int n)
	{
		num=n;
	}
	void rev()
	{
		/*System.out.println("enter a number");
		Scanner s=new Scanner(System.in);*/
		//double num=s.nextInt();
		int temp=num;
		int sum=0;
		int reversed=0;
			while(temp>0)
			{
				int digit=temp%10;
				reversed=reversed*10+digit;
				sum+=temp%10;
				temp/=10;
			}
			System.out.println("sum = "+sum);
			System.out.println("reverse of number:"+reversed);
	}
}
public class reverseDemo
{
	public static void main(String args[])
	{
		reverse t1=new reverse(12);
		t1.rev();
}
}
