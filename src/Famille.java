
public enum Famille {
	HEART("H"), SPADE("S"), CLOVER("C"), DIAMOND("D");

	
	private String str2;
	
	
	private Famille(String str){
		this.str2 = str;
	}
	
	public String toString(){
		return str2;
	}
	
}
