package Irisan;

import java.util.Scanner;

public class fibo {
	public static  void main (String[]args) {
		int fibonaci;
		int a=0, b=1, c=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan nilai B : ");
		fibonaci = in.nextInt();
		int j=1;
		for(int z=0; z<j;z++){
			c=b;
			b=b+a;
			a=c;
			if (fibonaci==c)
				System.out.println("ssss");
			else if (c>fibonaci)
				System.out.println("salah");
			else
				j++;
			
		}
	}
}
	