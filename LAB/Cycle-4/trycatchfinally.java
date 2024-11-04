import java.util.*;
public class trycatchfinally
{
	public static void main(String args[])
	{
		try
		{
			int [] num ={13,21,64};
			System.out.println(num[10]);
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
			System.out.println("Error occured in the program!");
		}
		finally
		{
			System.out.println("Finally Block");
			System.out.println("Try and Catch executed succesfully");
		}
	}
}
