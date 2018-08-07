package CommandLineArgs;

public class SumOfNumbers
{
	public static void main(String[] args)
	{
		System.out.println("Sum of three numbers is" + (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])));
	}

}
