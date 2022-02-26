package binus.ac.id.menu;

public class mobil extends menu {
	public void pinjemMobil(String tipenya) {
		if(tipenya.equals("SUV")||tipenya.equals("Minivan")||tipenya.equals("minivan")) {
			System.out.println("Turning on Entertaniment System....");
		}
		else {
			System.out.println("Boosting!!");
		}
	}
}
