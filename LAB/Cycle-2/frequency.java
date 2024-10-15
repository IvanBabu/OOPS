import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		int i,len,c=0;
		String s=new String();
		String ch=new String();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=s1.nextLine();
		System.out.println("Enter the character to find frequency of:");
		ch=s1.nextLine();
		char ch2=ch.charAt(0);
		len=s.length();
		for(i=0;i<len;i++)
		{
			if(s.charAt(i)==(ch2))
			{
				c+=1;
			}
		}
		System.out.println("The occurence of ' "+ch+" ' is:"+c);
		s1.close();
	}
}
