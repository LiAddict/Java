public class BirdSighting 
{
private String birdSpecies;
public String getBirdSpecies() {
	return birdSpecies;
}
public void setBirdSpecies(String birdSpecies) 
{
	this.birdSpecies = birdSpecies;
}
public int getNumberSeen() {
	return numberSeen;
}
public void setNumberSeen(int numberSeen) {
	this.numberSeen = numberSeen;
}
public int getYearDay() {
	return yearDay;
}
public void setYearDay(int yearDay) {
	this.yearDay = yearDay;
}
private int numberSeen;
private int yearDay;
public BirdSighting()
		{
			birdSpecies = "robin";
			numberSeen = 1;
			yearDay = 1;
		}

public BirdSighting(String birdSpecies, int numberSeen, int yearDay)
	{
		this.birdSpecies = birdSpecies;
		this.numberSeen = numberSeen;
		this.yearDay = yearDay;
	}
}

