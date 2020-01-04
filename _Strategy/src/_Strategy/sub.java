package _Strategy;

public class sub implements strategy{
	public int operation(int n1,int n2) {
		int a=n2-n1;
		if(a>=0) {
		return n2-n1;
		}
		return a*-1;
	}

}
