package _State;

public class startLine implements state{
public void doAction(context context) {
	System.out.println("Runner is in Start Line !");
	context.setState(this);
}
public String toString() {
	return "Start Whistle !	";
}
}
