package _Facade;

public class carSummoner {
private car bmw,audi,mercedes;
public carSummoner() {
	mercedes=new mercedes();
	bmw= new bmw();
	audi=new audi();
}
public void summonMercedes() {
	mercedes.info();
}
public void summonBMW() {
	bmw.info();
}
public void summonAudi() {
	audi.info();
}
		
}
