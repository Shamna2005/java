import java.util.Scanner;
class animal
{
    void makesound()
    {
        System.out.println("nothing");
    }
}
class cow extends animal
{
    void makesound()
    {
    System.out.println("moo...moo");
    }
} 
class sheep extends animal
{
    void makesound()
    {
    System.out.println("mee...mee");
    }
} 
class duck extends animal
{
    void makesound()
    {
    System.out.println("quack...quack");
    }
} 
class pig extends animal
{
    void makesound()
    {
    System.out.println("baa...baa");
    }
}
class animalDemo
{
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        animal obj[]=new animal[100];
        int i=0;
        while(true)
        {
            System.out.println("do you want to countinue");
            str=s.next();
            if(false)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("1.cow \n2.sheep\n3.duck\n4.pig");
            }
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    obj[i]=new cow();
                    obj[i].makesound();
                    break;
                case 2:
                    obj[i]=new sheep();
                    obj[i].makesound();
                    break;
                case 3:
                    obj[i]=new duck();
                    obj[i].makesound();
                    break;
                case 4:
                    obj[i]=new pig();
                    obj[i].makesound();
                    break;
            }
        }
    }
}
