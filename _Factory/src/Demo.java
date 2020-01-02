
public class Demo {

	public static void main(String[] args) {
	
		animalFactory af1 = new animalFactory();
		animal a1 = af1.getAnimal("human");
		a1.sound();
		animal a2= af1.getAnimal("cat");
		a2.sound();
		animal a3= af1.getAnimal("dog");
		a3.sound();
		System.out.println("Sound Again !! \n");
		a1.sound();
		a2.sound();
		a3.sound();

	}

}
