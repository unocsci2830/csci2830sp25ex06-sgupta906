package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
	protected String ingredient;
	
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Crust is: " + toString() + " (" + ingredient + ")";
	}

	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ing) {
		this.ingredient = ing;
	}
	
	public String checkIntegrity() {
		return "";
	}
	
	public Double getPrice() {
		return 0.75; // default price for crust
	}
}
