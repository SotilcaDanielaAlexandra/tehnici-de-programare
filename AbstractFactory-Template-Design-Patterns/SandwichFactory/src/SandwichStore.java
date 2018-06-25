
public abstract class SandwichStore {

	protected abstract Sandwich createSandwich(String item);
	 
	public Sandwich orderSandwich(String type) {
		Sandwich sandwich = createSandwich(type);
		System.out.println("--- Making a " + sandwich.getName() + " ---");						
		sandwich.templateSandwichPrepare();
        return sandwich;
	}
}
