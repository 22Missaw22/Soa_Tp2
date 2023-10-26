package service;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BanqueService b = new BanqueService();
		Compte c = b.getCompte(1);
		ArrayList<Compte> cs = b.getComptes(5);
		for (int i=0;i<cs.size();i++) {
			System.out.println(cs.get(i).getCode());
		}
	}
}
