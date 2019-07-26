package Numbers;
import java.util.*;
public class Math 
{
	public static class calc
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			int Input, choice, result= 1;
			int limits;
			System.out.println("how many numbers");
			limits = scan.nextInt();
			System.out.println("Enter numbers");
			int[] s = new int[limits];
			for (int i = 0; i < limits; i++) 
			{
				s[i] = scan.nextInt();
			}
			System.out.println("\n 1.Addition \n 2.Subtraction \n 3.multiplication \n 4.division ");
			choice = scan.nextInt();
			switch (choice)
			{
			case 1:
				for (int i = 0; i < limits; i++)
				{
					result += s[i];
				}
				System.out.println(result);
				break;
			case 2:
				for (int i = 1; i < limits; i++)
				{
					result -= s[i];
				}
				System.out.println(result);
				break;
			case 3:
				for (int i = 0; i < limits; i++)
				{
					result *= s[i];
				}
				System.out.println(result);
				break;
			case 4:
				for (int i = 0; i < limits; i++)
				{
					result /= s[i];
				}
				System.out.println(result);
				break;
			default:
			{
				System.out.println("invalid input");
			}
			}
		}
	}
}
