package _Strategy;

public class context {
private strategy strategy;
public context(strategy strategy) {
	this.strategy=strategy;
}
public int fourOperation(int n1,int n2) {
	return strategy.operation(n1, n2);
}
}
