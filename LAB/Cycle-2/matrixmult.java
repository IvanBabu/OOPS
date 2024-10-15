import java.util.*;
class matrixmult
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int m[][]=new int[50][50];
		int row,col,i,j,row2,col2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the no.of rows in matrix 1:");
		row=s1.nextInt();
		System.out.println("Enter the no.of columns in matrix 1:");
		col=s1.nextInt();
		System.out.println("Enter the no.of rows in matrix 2:");
		row2=s1.nextInt();
		System.out.println("Enter the no.of columns in matrix 2:");
		col2=s1.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter the a["+i+"]["+j+"] element:");
				a[i][j]=s1.nextInt();
			}
		}
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.println("Enter the b["+i+"]["+j+"] element:");
				b[i][j]=s1.nextInt();
			}
		}
		if(row==col2)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col2;j++)
				{
					for(int k=0;k<col;k++)
					{
						m[i][j]+=a[i][j]*b[j][i];
					}
				}
			}
			System.out.println("The product of matrix is:");
			for(i=0;i<col;i++)
			{
				System.out.println("\n");
				for(j=0;j<row2;j++)
				{
					System.out.print(m[i][j]+"\t");
				}
			}
		}
		else
		{
			System.out.println("The Matrix multiplication is not possible:");
		}
		s1.close();
	}
}
