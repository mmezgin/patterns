package _State;

public class finishLine implements state{
public void doAction(context context) {
	System.out.println("Runner is in finish line !");
	context.setState(this);
}
public String toString() {
	return "Finish Whistle !";
}
}
