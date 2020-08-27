package asalsayi;

import java.util.Scanner;

public class AsalSayiBul 
{

	public static void main(String[] args) 
	{
		System.out.print("Sayý Giriniz : ");
		int sayi = new Scanner(System.in).nextInt();
		boolean durum = true;
		for (int i = 2; i <= sayi; i++) 
		{
			if (sayi%i==0) 
			{
				durum=false;
				break;
			}
		}
		
		if (durum==true) 
		{
			System.out.println(sayi+" ASALdýr.");
		}
		else 
		{
			System.out.println("Asal Deðildir.");
		}

	}

}
