package _Flyweight;
import java.util.HashMap;

public class humanFactory {
private static final HashMap humanMap=new HashMap();
public static human getHuman(String name) {
human h1=(human)humanMap.get(name);
if(h1==null) {
	h1= new human(name);
	humanMap.put(name,h1);
	System.out.println("Author: "+name);
}
return h1;
}
}
