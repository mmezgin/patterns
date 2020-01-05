package _Builder;

public class demo {

	public static void main(String[] args) {
		MealBuilder mb1=new MealBuilder();
		Meal m1=mb1.makePizza();
		m1.showItems();
		m1=mb1.makeFanta();
		m1.showItems();
		System.out.println("Cost: "+ m1.getCost());
	}

}
