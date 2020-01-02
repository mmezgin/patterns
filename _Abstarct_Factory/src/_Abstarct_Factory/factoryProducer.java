package _Abstarct_Factory;

public class factoryProducer {
public static abstractFactory getFactory(boolean baby) {
	if(baby) {
		return new babyAnimalFactory();
	}
	else{
		return new animalFactory();
	}
}
}
