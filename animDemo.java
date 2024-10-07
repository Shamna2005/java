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
    System.out.println("cow sound");
    }
} 
class sheep extends animal
{
    void makesound()
    {
    System.out.println("sheep sound");
    }
} 
class duck extends animal
{
    void makesound()
    {
    System.out.println("duck sound");
    }
} 
class pig extends animal
{
    void makesound()
    {
    System.out.println("pig sound");
    }
}
class animDemo
{
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        animal obj[]=new animal[100];
        int i=0;
        boolean p=true;
        while(p)
        {
         /*   System.out.println("do you want to countinue");
            str=s.next();
            if(str=="no")
            {
                System.exit(0);
            }
            else
         {*/
               System.out.println("1.cow \n2.sheep\n3.duck\n4.pig\n5.exit");
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
                    case 5:
                    p=false;
			}
			i++;
        }
    }
}
