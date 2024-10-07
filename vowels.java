import java.util.Scanner;
class vowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string = ");
        String str=s.nextLine();
       String removal=str.replaceAll("[aeiouAEIOU]","");
       System.out.println("remov all vowels from the string = "+removal);
    } 
}

