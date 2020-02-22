import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) 
	{
		double firstValue;
		double secondValue;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter a value>>");
		firstValue = inputDevice.nextInt();
		System.out.print("Enter another value>>");
		secondValue = inputDevice.nextInt();
		calculatePercent(firstValue, secondValue);
		calculatePercent(secondValue, firstValue);
	}

	public static void calculatePercent(double num, double secondNum) 
	{
		double newNum;
		newNum = ((num/secondNum)*(100));
		System.out.println(num + " is " + newNum + "% of " + secondNum);
	}

}
