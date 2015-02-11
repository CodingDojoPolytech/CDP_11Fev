
public class Hand {
	Carte[] main;
	
	public Hand() {
		main=new Carte[5];
		
	}
	
	public Hand(String[] str){
		if (str.length != 5) 
			throw new RuntimeException("Wrong number of cards");
		main=new Carte[5];
		for (int i=0; i<5; i++) {
			main[i] = new Carte(str[i]);
		}
	}
	int i = 0;
	public void ajouterCarte(Carte c) {
		main[i] = c;
		i = (i+1)%5;
	}
	
	public Combinaison reconnaitreCombinaison(){
		int[] tab = new int[15];
		for(Carte card : main){
			tab[card.getValeur()]++;
		}
		for(int i=2;i<15;i++){
			if(tab[i]==2){
				return Combinaison.PAIR;
			}
		}
		return null;
	}
	
	

	public Carte[] getMain() {
		return main;
	}

	public void setMain(Carte[] main) {
		this.main = main;
	}
	
	public String toString() {
		String str = "";
		
		for(int i = 0 ; i < 5 ; i++) {
			str += main[i].toString();
			if(i != 4) {
				str += " ";
			}
		}
		return str;
	}

	
}
