
public class SibiuSandwichStore extends SandwichStore{
	protected Sandwich createSandwich(String item) {
		Sandwich sandwich = null;
		SandwichIngredientFactory ingredientFactory = 
			new SibiuSandwichIngredientFactory();
 
		if (item.equals("grilled meat")) {
  
			sandwich = new GrilledMeatSandwich(ingredientFactory);
			sandwich.setName("Sibiu Grilled Meat Sandwich");
  
		} else if (item.equals("vegetables")) {
 
			sandwich = new VeganSandwich(ingredientFactory);
			sandwich.setName("Sibiu Vegan Sandwich");
		}
		return sandwich;
	}

}
