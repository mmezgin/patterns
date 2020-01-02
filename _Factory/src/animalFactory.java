
public class animalFactory {
public animal getAnimal(String animalType) {
	if(animalType==null) {
		return null;
	}
	if(animalType.equalsIgnoreCase("cat")) {
		return new cat();
	}
	else if(animalType.equalsIgnoreCase("dog")){
		return new dog();
	}
	else if(animalType.equalsIgnoreCase("human")) {
		return new human();
	}
	return null;
}
}
