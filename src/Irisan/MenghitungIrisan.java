package Irisan;

import java.util.Scanner;

public class MenghitungIrisan {
	
	
	void inputganjil() {
		int ganjil, x;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan data : ");
		x = in.nextInt();
		MenghitungIrisan[] baru;
		baru = new MenghitungIrisan[x];
		for (int i = 0; i < baru.length; i++) {
			System.out.print("Masukan nilai A : ");
			ganjil = in.nextInt();
			int f = ganjil % 2;

			if (f == 1)
				System.out.println(i);
			else
				System.out
						.println("maaf angka yang anda masukkan bukan angka ganjil");

		}

	}

	void inputfibonaci() {
		int fibonaci;
		int a = 0, b = 1, c = 0;
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan data : ");
		x = in.nextInt();
		MenghitungIrisan[] baru;
		baru = new MenghitungIrisan[x];
		for (int i = 0; i < baru.length; i++) {
			System.out.print("Masukan nilai B : ");
			fibonaci = in.nextInt();
			int j = 1;
			for (int z = 0; z < j; z++) {
				c = b;
				b = b + a;
				a = c;
				if (fibonaci == c)
					irisan();
				else if (c > fibonaci)
					System.out.println("salah");
				else
					j++;
			}
		}
	}

	static int irisan() {
		MenghitungIrisan lama = new MenghitungIrisan();
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Nilai A = ganjil");
		System.out.println("Nilai B = fibonacci");
		// int banyak;
		// Scanner in = new Scanner(System.in);
		// System.out.print("MASUKKAN JUMLAH DATA : ");
		// banyak = in.nextInt();
		// MenghitungIrisan [] data;
		MenghitungIrisan data = new MenghitungIrisan();
		// for (int i =0; i<data.length; i++){
		// data [i] =new MenghitungIrisan();
		data.inputganjil();
		data.inputfibonaci();
	}

}