import java.io.*;
class filehandling
{
public static void main(String args[])
	{
		try{
			FileReader reader = new FileReader("input.txt");
			FileWriter writer = new FileWriter("output.txt");
			int character;
			System.out.println("Reading from input file and writing to outputfile");
			while((character = reader.read())!=-1)
			{
			writer.write(character);
			System.out.print((char) character);
			}
			reader.close();
			writer.close();
			System.out.println("\nFile content written succesfully to output file");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: Flie not found-"+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Error: I/O exception-"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		System.out.println();
	}
}