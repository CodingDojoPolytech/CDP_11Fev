
public class Hand {
	Carte[] main;
	
	public Hand(String[] str){
		if (str.length != 5) 
			throw new RuntimeException("Wrong number of cards");
		main=new Carte[5];
		for (int i=0; i<5; i++) {
			main[i] = new Carte(str[i]);
		}
	}
	
	public Combinaison reconnaitreCombinaison(){
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
