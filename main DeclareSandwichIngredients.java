//Elizabeth Grace Jen
//DeclareSandwichIngredients.java
//2/20/18
public class DeclareSandwichIngredients {

	public static void main(String[] args)
	{	Sandwich lunch = new Sandwich();
		lunch.setIngredientType("tuna");
		lunch.setBreadType("wheat");
		lunch.setSandwichPrice(4.99);
		System.out.println("You have ordered a " + lunch.getIngredientType() +
				" sandwhich on " + lunch.getBreadType() + " bread, and the "
						+ "price is $	" + lunch.getSandwichPrice());

	}

}
