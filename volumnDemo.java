import java.util.Scanner;
interface volumn
{
	double pi=3.14;
	void readData();
	void dispVolumn();
}
class sphere implements volumn
{
	double radius;
	sphere(double r)
	{
		radius=r;
	}
	
	public void readData()
	{
		Scanner s=new Scanner(System.in);
			System.out.println("enter the radius of sphere");
		radius=s.nextDouble();
	}
	public void dispVolumn()
	{
	double volumn=4/3*pi*radius*radius;
		System.out.println("sphere volumn"+volumn);
	}
}
class cylinder implements volumn
{
	double radius;
	double height;
	cylinder(double r,double h)
	{
		radius=r;
		height=h;
	}
	public void readData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("eneter the radius of cylinder");
		radius=s.nextDouble();
		System.out.println("eneter the height of cylinder");
		height=s.nextDouble();
	}
	public void dispVolumn()
	{
		double volumn=pi*radius*radius*height;
		System.out.println("sphere volumn"+volumn);
	}
}
public class volumnDemo
{
	public static void main(String args[])
	{
		sphere obj1=new sphere(5);
		cylinder obj2=new cylinder(5,10);
	obj1.readData();
		obj1.dispVolumn();
		obj2.readData();
		obj2.dispVolumn();
	}
}

