package Irisan;

import java.util.Scanner;

public class irisan {
	static int a;
	static int b;
	static boolean f=a%2!=0;
	int d;
	int c;

	boolean ganjil(){
		return a%2!=0;
	}
	int bonan (){
		c = b;
		b = b + d;
		d = c;
		return c;
	}
	
	void input() {
		
	}
	
	
public static void main (String []args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Masukan nilai a: ");
	a = in.nextInt();
	System.out.print("Masukan nilai b : ");
	b = in.nextInt();
	 //if (a==f){
		  
	// }
	
}
	
}
