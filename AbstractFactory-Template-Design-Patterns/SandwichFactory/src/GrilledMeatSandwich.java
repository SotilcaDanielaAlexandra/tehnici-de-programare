
public class GrilledMeatSandwich extends Sandwich{
	SandwichIngredientFactory ingredientFactory;
	 
	public GrilledMeatSandwich(SandwichIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	@Override
	public void prepareSandwichIngredients() {
		System.out.println("Preparing " + name);
		bread = ingredientFactory.createBread();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		spread = ingredientFactory.createSpread();
		meat = ingredientFactory.createMeat();
		vegetables = ingredientFactory.createVegetables();
	}
	
	@Override
	public void cutBread() {
	System.out.println("Slice bread in half");
	}

	@Override
	public void warmUpBread() {
	System.out.println("Warm up bread in oven");
	}	

	@Override
	public void packSandwich() {
	System.out.println("Pack sandwich for client");
	}
}


