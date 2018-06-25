
public class SibiuSandwichIngredientFactory implements SandwichIngredientFactory {
	
	public Bread createBread(){
		return new WhiteBread();
	}
	
	public Sauce createSauce(){
		return new CreamyItalian();
	}
	
	public Spread createSpread(){
		return new Avocado();
	}
	
	public Vegetables[] createVegetables(){
		Vegetables vegetables[] = { new Mushrooms(), new Olives(), new Tomatoes()};
		return vegetables;
	}
	
	public Cheese createCheese(){
		return new Mozzarela();
	}
	
	public Falafel createFalafel(){
		return new LentilFalafel();
	}
	
	public Meat createMeat(){
		return new GrilledShrimp();
	}
	
}
