import java.util.ArrayList;

public abstract class Sandwich {
	
	String name;
	Bread bread;
	Sauce sauce;
	Spread spread;
	Vegetables vegetables[];
	Cheese cheese;
	Falafel falafel;
	Meat meat;
	
	/**
     * Template method Pattern - Sequence of processes.
     * To define the sequence to prepare Sandwich.
     * @return 
     */
	public void templateSandwichPrepare() {	     	      	      	      	         
	      cutBread();
	      warmUpBread();
	      prepareSandwichIngredients();
	      packSandwich();
	    }
	
	public abstract void cutBread();
	public abstract void warmUpBread();
	public abstract void prepareSandwichIngredients();
	public abstract void packSandwich();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (bread != null) {
			result.append(bread);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (spread != null) {
			result.append(spread);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (meat != null) {
			result.append(meat);
			result.append("\n");
		}
		if (falafel != null) {
			result.append(falafel);
			result.append("\n");
		}
		if (vegetables != null) {
			for (int i = 0; i < vegetables.length; i++) {
				result.append(vegetables[i]);
				if (i < vegetables.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}		
		return result.toString();
	}
}
