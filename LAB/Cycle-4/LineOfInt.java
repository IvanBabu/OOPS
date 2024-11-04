import java.util.*;
class LineOfInt
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a line of integers separated by space:");
	String inputLine =sc.nextLine();
	String[] numbers = inputLine.split("");
	int sum=0;
	System.out.println("The integers are:");
	for(String numStr : numbers)
	{
		int num= Integer.parseInt(numStr);
		System.out.println(num);
		sum +=num;
	}
	System.out.println("The sum of all integers is:"+sum);
	}
}
