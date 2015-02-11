
public class Carte implements Comparable<Carte> {
	private int valeur;
	private Famille famille;
	
	public Carte(String code) {
		char valeur = code.charAt(0);
		char couleur = code.charAt(1);
		switch(valeur){
		case 'T':
			this.valeur = 10;
			break;
		case 'J':
			this.valeur = 11;
			break;
		case 'Q':
			this.valeur = 12;
			break;
		case 'K':
			this.valeur = 13;
			break;
		case 'A':
			this.valeur = 14;
			break;
		default : 
			this.valeur = Integer.parseInt(""+valeur);
		}
		
		switch(couleur){
		case 'H':
			this.famille = Famille.HEART;
			break;
		case 'S':
			this.famille = Famille.SPADE;
			break;
		case 'C':
			this.famille = Famille.CLOVER;
			break;
		case 'D':
			this.famille = Famille.DIAMOND;
			break;

		}
		
		
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
	
	public String toString() {
		String str ="";
		switch(valeur) {
		case 10 :
			str += "T";
			break;
		case 11 :
			str += "J";
			break;
		case 12 :
			str += "Q";
			break;
		case 13 :
			str += "K";
			break;
		case 14 :
			str += "A";
			break;
		default:
			str += new Integer(valeur).toString();
		}
		return str + famille.toString();
	}
	
	@Override
	public int compareTo(Carte c) {
		return (int) Math.signum((this.valeur - c.valeur));
	}
}
