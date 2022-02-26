package binus.ac.id.menu;

import java.util.Scanner;

public class motor extends menu{
	public void output(String nama) {
		System.out.println(nama+" is standing!");
	}
	
	public void harga(int helm) { 
		Scanner scanner = new Scanner(System.in);
		int harga;
		System.out.print("Harga helm: ");
		harga = scanner.nextInt();
		System.out.println("Price: "+ harga*helm);
		
	}
}
