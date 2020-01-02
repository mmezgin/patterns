package _Singleton;

public class singleObj {
private static singleObj car = new singleObj();
private singleObj() {}
public static singleObj getCar() {
	return car;
}
public void msg() {
	System.out.println("An ordinary car!");
}
}
