// Input: Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
public class Main {

	public static Hand[] decompose(String toAnalyze) {
		String[] splited = toAnalyze.split(" ");
		String[] blackHand = new String[5];
		for (int i = 1; i <= 5; i++) {
			blackHand[i - 1] = splited[i];
		}

		String[] whiteHand = new String[5];
		for (int i = 7; i <= 11; i++) {
			whiteHand[i - 7] = splited[i];
		}
		
		return new Hand[]{ new Hand(blackHand),new Hand(whiteHand)};
	}

	public static void main(String args[]) {
		System.out
				.println("Bienvenue au Coding Dojo Polytech du Mercredi 11 Février 2015 !");

	}
}
