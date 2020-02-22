import java.util.Scanner;
public class TestBirdSighting {

	public static void main(String[] args)
	{
	BirdSighting birdSighting1 = new BirdSighting();
	BirdSighting birdSighting2 = new BirdSighting();
	birdSighting2 = getData();
	showValues(birdSighting1);
	showValues(birdSighting2);
	}

	private static void showValues(BirdSighting birdSighting2)
	{
		System.out.println( birdSighting2.getNumberSeen() + " " + birdSighting2.getBirdSpecies() + "(s)"
				+ " sighted on day " + birdSighting2.getYearDay() + " of the year."	 );
		
	}

	private static BirdSighting getData()
	{
		Scanner scanner = new Scanner(System.in);
		BirdSighting birdSighting = new BirdSighting();
		System.out.println("Enter bird species >>");
		String species = scanner.nextLine();
		System.out.println("Enter number sighted >>");
		int number = scanner.nextInt();
		System.out.println("Enter day of year sighted >>");
		int day = scanner.nextInt();
		birdSighting.setBirdSpecies(species);
		birdSighting.setNumberSeen(number);
		birdSighting.setYearDay(day);
		return birdSighting;
	}

}
