package asalsayi;

import java.util.ArrayList;
import java.util.Scanner;

public class AsalSayilarDizi {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> asalSayilar = new ArrayList<>();
		
		System.out.print("Say� Giriniz : ");
		int sayi = new Scanner(System.in).nextInt();
		boolean durum = true;
		long bas =System.currentTimeMillis();
		for (int i = 2; i <= sayi; i++) 
		{
			durum=true;
			for (Integer x : asalSayilar) 
			{
				if (i%x==0) {
					durum=false;
					break;
				}
				
				if (Math.sqrt(i)>x) {
					break;
				}
			}
			
			if (durum) {
				asalSayilar.add(i);
			}
		}
		long son = System.currentTimeMillis();
		
		
		for (Integer eleman : asalSayilar) {
			System.out.println(eleman);
		}
		System.out.println((son-bas)+" sanise s�rd�.");
		System.out.println(asalSayilar.size()+" tane asal say� vard�r.");
		
	}

}
