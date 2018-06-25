
public class TokyoSandwichStore extends SandwichStore{
	protected Sandwich createSandwich(String item) {
		Sandwich sandwich = null;
		SandwichIngredientFactory ingredientFactory = 
			new TokyoSandwichIngredientFactory();
 
		if (item.equals("grilled meat")) {
  
			sandwich = new GrilledMeatSandwich(ingredientFactory);
			sandwich.setName("Tokyo Cheese Sandwich");
  
		} else if (item.equals("vegan")) {
 
			sandwich = new VeganSandwich(ingredientFactory);
			sandwich.setName("Tokyo Vegan Sandwich");
		}
		return sandwich;
	}
}
