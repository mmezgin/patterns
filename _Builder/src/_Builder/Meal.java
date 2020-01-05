package _Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
private List<Item> items=new ArrayList<Item>();
public void addItem(Item item) {
	items.add(item);
}
public double getCost() {
	double cost=0;
	for(Item item:items) {
		cost+=item.price();
	}
	return cost;
}

public void showItems() {
	for(Item item: items){
		System.out.println("Item Name: "+item.name()+" Cost: "+item.price()+" Weight SI Unit: "+item.weight().SI());
	}
}

}
