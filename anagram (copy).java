import java.util.Arrays;
import java.util.Scanner;
class anagram
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first string = ");
        String str1=s.nextLine();
         System.out.println("enter second string = ");
        String str2=s.nextLine();
        /*if(str1.length()!=str2.length())
        {
            return false;
        }*/
         char Array1[]=str1.toUpperCase().toCharArray();
         char Array2[]=str2.toUpperCase().toCharArray();
         Arrays.sort(Array1);
         Arrays.sort(Array2);
         if(Arrays.equals(Array1,Array2))
         {
            System.out.println("anagram");
         }
         else
         {
            System.out.println("not anagram");
         }

    }
}
