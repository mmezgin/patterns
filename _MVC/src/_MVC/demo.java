package _MVC;

public class demo {
	
	public static void main(String[] args) {
		animalModel model=defaultAnimal();
			animalView view=new animalView();
			animalController controller= new animalController(model,view);
			controller.updateView();
			controller.setAnimalName("tiger");
			controller.updateView();
			controller.setID(22);
			controller.updateView();


	}
private static animalModel defaultAnimal() {
	animalModel a= new animalModel();
	a.setID(1);
	a.setName("default");
	return a;
}
}
