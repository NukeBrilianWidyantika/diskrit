package Irisan;

import java.util.Scanner;

public class DiskritIrisan {
	public static void main(String[] args) {
        int ganjil,a,b,c,d,i,counter,jumlah,bb=1,ba=1,hasil,fibo=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Batas Bawah = ");
        a = in.nextInt();
        System.out.println("Masukkan Batas Atas = ");
        b = in.nextInt();
            if(a%2==0&&b%2==0){
                ganjil = (b-a)/2;
            }
            else{
                ganjil = ((b-a)/2)+1;
            }
            System.out.println("rinka odd = "+ganjil);
        for(counter=0;counter<ganjil-2;counter++){
	hasil=bb+ba;// hasil berasal dari a+b
	bb=ba;//nilai b berubah jadi a
	ba=hasil;//nilai hasil berubah jadi b
            fibo++; 
	}
        if(a<=2){
            fibo+=2;
        }
        if(a==2)
        {
            fibo++;
        }
        System.out.println("fibonacci = "+fibo);
    }
}
