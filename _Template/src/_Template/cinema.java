package _Template;

public abstract class cinema {
	abstract void start();
	abstract void play();
	abstract void finish();
	
	public final void run() {
		start();
		play();
		finish();
	}

}
