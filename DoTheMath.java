//Elizabeth Grace Jen
//Ch3aEX
//2/13/18
import java.util.Scanner;
public class DoTheMath {

	public static void main(String[] args) 
	{
		
		int firstInteger;
		int secondInteger;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter an integer>>");
		firstInteger = inputDevice.nextInt();
		System.out.print("Enter another integer>>");
		secondInteger = inputDevice.nextInt();
		addTen(firstInteger);
		addHundred(firstInteger);
		addThousand(firstInteger);
		addTen(secondInteger);
		addHundred(secondInteger);
		addThousand(secondInteger);
	}

	public static void addThousand(int newNum)
	{
		int num;
		num = newNum + 1000;
		System.out.println(newNum + " plus 1000 is " + num);
		
	}

	public static void addTen(int newNum) 
		{
			int num;
			num = newNum + 10;
			System.out.println(newNum + " plus 10 is " + num);
			
		}
	

	public static void addHundred(int newNum)
	{
		int num;
		num = newNum + 100;
		System.out.println(newNum + " plus 100 is " + num);
		
	}

}
