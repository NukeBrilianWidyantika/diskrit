package Irisan;

import java.util.Scanner;

public class Coba {
	public static void main(String[] args) {
        int ganjil,fibo=0,irisan=0,bb=1,ba=10,a=1,add=1,hasil;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Batas Bawah = ");
        bb = in.nextInt();
        System.out.println("Masukkan Batas Atas = ");
        ba = in.nextInt();
            if(bb%2==0&&ba%2==0){
                ganjil = (ba-bb)/2;
            }
            else{
                ganjil = ((ba-bb)/2)+1;
            }
        System.out.println("bilangan ganjil : "+ganjil);
        for(int i=bb;i<=ba;i++){
            if(a>=bb && a<=ba){
                fibo++;
                if(a%2!=0){
                        irisan++;
                    }
            }
                    
	hasil=a;// hasil berasal dari a+b
	a+=add;//nilai b berubah jadi a
	add=hasil;//nilai hasil berubah jadi b
        }
        System.out.println("bilangan fibbonaci : "+fibo);
        System.out.println("ganjil irisan fibbonaci : "+irisan);
    }
}
