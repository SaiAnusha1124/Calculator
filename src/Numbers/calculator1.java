package Numbers;
import Numbers.Math.calc;
public class calculator1 extends calc 
{
	public int addition(int Input) 
	{
		int result = 0;
		for (int userInputs : Input) 
		{
			result = result + userInputs;
		}
		return result;
	}
	public int subtraction(int Input) 
	{
		int result = 0;
		for (int userInputs : Input) 
		{
			result = result - userInputs;
		}
		return result;
	}
	public int multiplication(int Input) 
	{
		int result = 0;
		for (int userInputs : Input) 
		{
			result = result * userInputs;
		}
		return result;
	}
	public int division(int Input) 
	{
		int result = 0;
		for (int userInputs : Input) 
		{
			result = result / userInputs;
		}
		return result;
	}
	
}
