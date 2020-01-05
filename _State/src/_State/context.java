package _State;

public class context {
private state state;
public context() {
	state=null;
}
public void setState(state state) {
	this.state=state;
}
public state getState() {
	return state;
}
}
