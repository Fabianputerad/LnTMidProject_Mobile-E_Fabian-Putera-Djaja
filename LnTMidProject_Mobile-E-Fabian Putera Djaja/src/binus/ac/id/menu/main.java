package binus.ac.id.menu;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class main extends menu {

	

	public static void main(String[] args) {
		ArrayList<menu> view = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String Type, brand, name, TYPEK, license;
		int top, gas, wheel, ent, helm, price;
		mobil Mobil = new mobil();
		motor Motor = new motor();
		menu Menu = new menu();
		int cek =0;
	
		int n;
		do {
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.print(">> ");
			n = scanner.nextInt();
			
			if(n==1) {
					
						System.out.print("Type: ");
					Type = scanner.next();
					Menu.setType(Type);
					
					
					
					System.out.print("Brand: ");
					brand = scanner.next();
					Menu.setBrand(brand);
					System.out.print("Name: ");
					name = scanner.next();
					Menu.setName(name);
					System.out.print("License Plate: ");
					license=scanner.next();
					Menu.setLicense(license);
					System.out.print("Top Speed [100-250]: ");
					top = scanner.nextInt();
					Menu.setTop(top);
					if(top>=100 &&top<=250) {
					System.out.print("Gas Capacity [30-60]: ");
					gas =scanner.nextInt();
					Menu.setGas(gas);	
					if(gas>=30 && gas<=60) {
						if(Type.equals("Car")||Type.equals("car")){
								System.out.print("Wheel [4-6]: ");
								wheel = scanner.nextInt();
								Menu.setWheel(wheel);
								if(wheel>=4&&wheel<=6) {
									System.out.print("Type [SUV | Supercar | Minivan]: ");
									TYPEK = scanner.next();
									Menu.setTipenya(TYPEK);
									System.out.print("Entertainment System: ");
									ent=scanner.nextInt();
									
								}
								
							}
							
						
				
					
					else if(Type.equals("Motorcycle")||Type.equals("motorcycle")){
								System.out.print("Wheel [2-4]: ");
								wheel = scanner.nextInt();
								Menu.setWheel(wheel);
								if(wheel>=2&&wheel<=4) {
									System.out.print("Type [Automatic | Manual]: ");
									TYPEK = scanner.next();
									Menu.setTipenya(TYPEK);										
									System.out.print("Helm: ");
									helm=scanner.nextInt();
									
								}
								
							}
							
						
						
					}
				}
					
					view.add(Menu);
			}
				
					
			
			else if(n==2){
					System.out.println("|---|-----------|------------|");
					System.out.println("|No |Tipe       |Nama        |");
					System.out.println("|---|-----------|------------|");
					for(int i=0;i<view.size();i++) {
						System.out.printf("|%-3d|%-11s|%-12s|\n", i+1, view.get(i).getType(), view.get(i).getName());
						System.out.println("|---|-----------|------------|");
						
					}
					int pilih;
					System.out.print("Enter Vehicle ID: ");
					pilih=scanner.nextInt();
					for(int i=0;i<view.size();i++) {
						if(pilih==i+1) {	
							System.out.println("Type: "+view.get(i).getType());
							System.out.println("Brand: "+view.get(i).getBrand());
							System.out.println("Name: "+view.get(i).getName());
							System.out.println("License: "+view.get(i).getLicense());
							System.out.println("Gas Capacity: "+view.get(i).getGas());
							System.out.println("Top Speed: "+view.get(i).getTop());
							if(view.get(i).getType().equals("Car")||view.get(i).getType().equals("car")) {
								Mobil.pinjemMobil(view.get(i).getTipenya());
							}
							else {
								Motor.harga(view.get(i).getHelm());
								Motor.output(view.get(i).getName());
								
							}
					}
			}
		}
		}while(n!=3);
		
		}
	}


