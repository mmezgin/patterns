package _State;

public class demo {
public static void main(String[]args) {
	context c = new context();
	startLine s= new startLine();
	s.doAction(c);
	System.out.println(c.getState().toString());
	finishLine f=new finishLine();
	f.doAction(c);
	System.out.println(c.getState().toString());
}
}
