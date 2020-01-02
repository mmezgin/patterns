package _Abstarct_Factory;

public class animalFactory extends abstractFactory {
public animal getAnimal(String animalType) {
	if(animalType.equalsIgnoreCase("dog")) {
		return new dog();
	}
	else if(animalType.equalsIgnoreCase("cat")) {
		return new cat();
	}
	
	return null;
}
}
