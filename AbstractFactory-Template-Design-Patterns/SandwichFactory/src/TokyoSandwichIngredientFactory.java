
public class TokyoSandwichIngredientFactory implements SandwichIngredientFactory {
	
	public Bread createBread(){
		return new MultiGrainBread();
	}
	
	public Sauce createSauce(){
		return new Chipotle();
	}
	
	public Spread createSpread(){
		return new HerbCheese();
	}
	
	public Vegetables[] createVegetables(){
		Vegetables vegetables[] = { new Olives(), new Tomatoes()};
		return vegetables;
	}
	
	public Cheese createCheese(){
		return new Cheddar();
	}
	
	public Falafel createFalafel(){
		return new SweetPotatoFalafel();
	}
	
	public Meat createMeat(){
		return new GrilledBeef();
	}
	
}
