abstract class shape
{
    abstract void area();
}
abstract class twoDim extends shape
{
    abstract void area();
}
abstract class threeDim extends shape
{
    abstract void area();
}
class square extends twoDim
{
    double a;
    square(double side)
    {
        a=side;
    }
    void area()
    {
       double area=a*a;
        System.out.println("area of square = "+area);
    }
}
class traingle extends twoDim
{
    double base;
    double height;
    traingle(double b,double h)
    {
        base=b;
        height=h;       
    }
    void area()
    {
       double area=(base*height)/2;
        System.out.println("area of square = "+area);
    }
}
class sphere extends threeDim
{
    double pi=3.14;
    double radius;
    sphere(double r)
    {
        radius=r;
    }
    void area()
    {
       double area=4*pi*radius*radius;
        System.out.println("area of square = "+area);
    }
}
class cube extends threeDim
{
    double side;
    cube(double s)
    {
        side=s;
    }
    void area()
    {
       double area=6*side*side;
        System.out.println("area of square = "+area);
    }
}
class shapeDemo
{
	public static void main(String args[])
	{
		square obj1=new square(2);
		traingle obj2=new traingle(2,4);
		sphere obj3=new sphere(2);
		cube obj4=new cube(6);
		obj1.area();
		obj2.area();
		obj3.area();
		obj4.area();
	}
}
