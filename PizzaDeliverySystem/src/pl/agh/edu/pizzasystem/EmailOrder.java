package pl.agh.edu.pizzasystem;

public class EmailOrder implements IPizzaOrder {

	@Override
	public String orderPizza() {
		return "Pizza ordered by Email";
	}

}
