package asalsayi;

import java.util.Scanner;

public class AsalSayilar {

	public static void main(String[] args) {
		System.out.print("Sayý Giriniz : ");
		int sayi = new Scanner(System.in).nextInt();
		long bas = System.currentTimeMillis();
		for (int j = 2; j <= sayi; j++) 
		{
			boolean durum = true;
			for (int i = 2; i <= Math.sqrt(j); i++) {
				
				if (j%i==0) {
					durum=false;
					break;
				}
			}
			
			if (durum==true) {
				System.out.println(j+" ASALdýr.");
			}
		}
		long son = System.currentTimeMillis();
		System.out.println((son-bas)+" sanise sürdü.");

	}

}
