import java.util.*;
class transpose
{
	public static void main(String args[])
	{
	  int a[][]=new int [50][50];
          int t[][]=new int [50][50];
	  int i,j,row,col;
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter the no of rows in the matrix");
  	  row=s1.nextInt();
	  System.out.println("Enter the no of col in the matrix");
	  col=s1.nextInt();
	  System.out.println("Enter the matrix");
	  for(i=0;i<row;i++)
	  {
		for(j=0;j<col;j++)
   		{
			a[i][j]=s1.nextInt();
		}
	  }
	  for(i=0;i<row;i++)
	  {
		for(j=0;j<col;j++)
   		{
			t[i][j]=a[j][i];
		}
	  }
	  System.out.println("the matrix is");
	   for(i=0;i<row;i++)
	  {
		for(j=0;j<col;j++)
   		{
		  System.out.print(a[i][j]+"\t");
		}
		System.out.println("\n");
	  }
	   System.out.println("the transpose is");
	   for(i=0;i<row;i++)
	  {
		for(j=0;j<col;j++)
   		{
		  System.out.print(t[i][j]+"\t");
		}
	        System.out.println("\n");
	  }	
	}
}
