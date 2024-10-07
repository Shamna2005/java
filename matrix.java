import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter matrix rows = ");
        int row=s.nextInt();
        System.out.println("enter matrix column = ");
        int col=s.nextInt();
        int matrix[][]=new int[row][col];
         int transposed[][]=new int[col][row];
         int trace=0;
        System.out.println("enter the elements of matrix = ");
        for(int i=0;i<row;i++)
         {
          for(int j=0;j<col;j++)
            {
            matrix[i][j]=s.nextInt();
            }
	     }
	     System.out.println("matrix =");
	     for(int i=0;i<row;i++)
         {
          for(int j=0;j<col;j++)
            {
            System.out.print(matrix[i][j]+"\t");
            transposed[j][i]=matrix[i][j];
            }
            System.out.println("\n");
	     }
	     System.out.println("transpose =");
		 for(int i=0;i<col;i++)
		 {
			 for(int j=0;j<row;j++)
			 {
				 System.out.print(transposed[i][j]+"\t");
        }
                    System.out.println("\n");
		 }
		  for(int i=0;i<matrix.length;i++)
		  {
			  trace+=matrix[i][i];
		  }
		   System.out.println("trace = "+trace);
	 }
}
