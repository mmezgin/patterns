package _Flyweight;

public class human implements speak{
private String name,gender;
private int age;
private double weight,height;

public human(String name) {
	this.name=name;
}
public void setGender(String gender) {
	this.gender=gender;
}
public void setAge(int age) {
	this.age=age;
}
public void setWeight(double weight) {
	this.weight=weight;
}
public void setHeight(double height) {
	this.height=height;
}


public void introduce() {
System.out.println("Hi! My name is "+name+", i am "+age+" years old. My weight is "+weight+
		" kg and height is "+height+" cm. Also as you understand i m a "+gender+" !");	
}
}
