
public class Carte {
	private int valeur;
	private Famille famille;
	
	public Carte(String code) {
		char valeur = code.charAt(0);
		char couleur = code.charAt(1);
		
		
	}
	
	
	public Carte(int valeur, Famille famille){
		if(valeur > 14 || valeur < 2)
			throw new RuntimeException("bad card value");
		this.setValeur(valeur);
		this.setFamille(famille);
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	
	//TODO carte.toString()
}
