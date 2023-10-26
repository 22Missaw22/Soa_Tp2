package service;

import java.time.*;
import java.util.*;

public class BanqueService {
	public double conversion (double montant) {
		return montant * 3.36;
	}
	
	public Compte getCompte(int code) {
		return new Compte(code,0,LocalDateTime.now());
	}
	
	public ArrayList<Compte> getComptes(int nbr) {
		ArrayList<Compte> cs = new ArrayList<>();
		BanqueService bs = new BanqueService();
		for (int i=0;i<nbr;i++) {
			cs.add(bs.getCompte(i));
		}
		return cs;
	}
}

