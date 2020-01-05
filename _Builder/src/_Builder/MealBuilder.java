package _Builder;

public class MealBuilder {
public Meal makePizza() {
	
	Meal meal = new Meal();
	meal.addItem(new Pizza());
	return meal;
	
}
public Meal makeFanta() {
	
	Meal meal=new Meal();
	meal.addItem(new Fanta());
	return meal;
}
}
