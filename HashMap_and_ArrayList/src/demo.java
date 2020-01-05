import java.util.ArrayList;
import java.util.HashMap;

public class demo {
	public static void main (String[]args) {
		String Arr[] = {"a","b","c"};
		for(int i=0;i<3;i++) {
			System.out.println(Arr[i]);
		}
		ArrayList<String>carNames=new ArrayList<String>();
		carNames.add("audi");
		carNames.add("mercedes");
		carNames.add("opel");
		HashMap<Integer,String>cars=new HashMap<Integer,String>();
		cars.put(1,"bmw");
		for(int i=1;i<=3;i++) {
			cars.put(i+1,carNames.get(i-1));
		}
		for(int i=1;i<=cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---------------------");
		for(String i: carNames) {
			System.out.println(i);
			
	
		}
		System.out.println("\n.remove(index) .clear() for both :)");
	}
	

	
}
