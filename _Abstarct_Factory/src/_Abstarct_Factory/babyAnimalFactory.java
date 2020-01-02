package _Abstarct_Factory;

public class babyAnimalFactory extends abstractFactory{
public animal getAnimal(String animalType) {
	if(animalType.equalsIgnoreCase("cat")) {
		return new babyCat();
	}
	else if(animalType.equalsIgnoreCase("dog")) {
		return new babyDog();
	}
	return null;
}
}
