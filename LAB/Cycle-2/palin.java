import java.util.*;
class palin
{
	public static void main(String args[])
	{
		String s;
        String rev=new String();
		int l;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=s1.nextLine();
		l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("It is a  Palindrome!");
		}
		else
		{
			System.out.println("It is not a Palindrome!");
		}
		s1.close();
	}
}
