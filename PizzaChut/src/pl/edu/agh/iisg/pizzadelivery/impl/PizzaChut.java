package pl.edu.agh.iisg.pizzadelivery.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;
import pl.edu.agh.iisg.pizzadelivery.Pizza;

public class PizzaChut implements IPizzaDelivery {
	
	Collection pizze;
	
	public PizzaChut() {
		
		pizze = new ArrayList<>();
		
		Pizza pieczarkowa = new Pizza("Pieczarkowa", 1);
		Pizza salami = new Pizza("Salami", 1);
		Pizza farmerska = new Pizza("Farmerska", 1);
		
		pizze.add(pieczarkowa);
		pizze.add(salami);
		pizze.add(farmerska);
		
		
	}

	@Override
	public Collection<Pizza> getAllPizzas() {
		return pizze;
	}

}
