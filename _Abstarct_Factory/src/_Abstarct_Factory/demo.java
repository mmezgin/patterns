package _Abstarct_Factory;

public class demo {

	public static void main(String[] args) {
		abstractFactory f1= factoryProducer.getFactory(true);
		animal a1= f1.getAnimal("cat");
		abstractFactory f2=factoryProducer.getFactory(false);
		animal a2= f2.getAnimal("cat");
		abstractFactory f3= factoryProducer.getFactory(true);
		animal a3 = f3.getAnimal("dog");
		abstractFactory f4= factoryProducer.getFactory(false);
		animal a4 = f4.getAnimal("dog");
		
		a1.sound();
		a2.sound();
		a3.sound();
		a4.sound();
		
		
	}

}
