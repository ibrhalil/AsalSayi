package asalsayi;

import java.util.Scanner;

public class AsalSayiBul 
{

	public static void main(String[] args) 
	{
		System.out.print("Say� Giriniz : ");
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
			System.out.println(sayi+" ASALd�r.");
		}
		else 
		{
			System.out.println("Asal De�ildir.");
		}

	}

}
