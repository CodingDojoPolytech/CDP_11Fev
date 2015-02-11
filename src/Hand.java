
public class Hand {
	Carte[] main;
	
	public Hand(){
		main=new Carte[5];
	}

	public Carte[] getMain() {
		return main;
	}

	public void setMain(Carte[] main) {
		this.main = main;
	}

}
