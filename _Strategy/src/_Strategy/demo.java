package _Strategy;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		context sum=new context(new sum());
		context sub=new context(new sub());
		context mul=new context(new mul());
		context div=new context(new div());
		System.out.println("Please enter 2 variable for 4 operations");
		Scanner sc1=new Scanner(System.in);
		int n1=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		int n2=sc2.nextInt();
		System.out.println(n1+"+"+n2+"= "+sum.fourOperation(n1,n2));
		System.out.println(n1+"-"+n2+"= "+sub.fourOperation(n1,n2));
		System.out.println(n1+"*"+n2+"= "+mul.fourOperation(n1,n2));
		System.out.println(n1+"/"+n2+"= "+div.fourOperation(n1,n2));
		
		

	}

}
