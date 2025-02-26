package pizza.topping;
import pizza.MenuItem;

public abstract class PizzaTopping  implements MenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Topping is: " + toString();
	}

	public Double getPrice() {
		return 0.50; // default price for topping
	}
}
