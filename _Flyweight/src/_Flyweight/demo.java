package _Flyweight;

import java.util.Random;

public class demo {
	private static final String names[]= {"mert","ufuk","onder","samet","anýl","akif","berke"};
	private static final String genders[]= {"male","female"};
	public static void main(String[]args) {
		Random rndName= new Random(6);
		Random rndAge=new Random(19);
		Random rndGender= new Random(2);
		Random rndWeight=new Random(20);
		Random rndHeight=new Random(40);
		
		for (int i=0;i < 10;i++) {
			
			int x= rndName.nextInt(6);
			int y=rndAge.nextInt(19);
			int z=rndGender.nextInt(2);
			double t=rndHeight.nextInt(40);
			double w= rndWeight.nextInt(20);
			human h2= (human)humanFactory.getHuman(names[x]);
			h2.setAge(y+10);
			h2.setGender(genders[z]);
			h2.setHeight(t+150);
			h2.setWeight(w+60);
			h2.introduce();
		}
		
	
		
		
		
		
		}
	}

