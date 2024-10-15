import java.util.Scanner;
public class LargestOfNNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values you want to compare: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Enter the first number: ");
        int largest = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Enter the next number: ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
