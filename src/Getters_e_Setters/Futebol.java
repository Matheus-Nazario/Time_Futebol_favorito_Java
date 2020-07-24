package Getters_e_Setters;

public class Futebol {
	
	private String nomeTime;

	public String getTime() {		
		return nomeTime;
	}

	public void setTime(String meuTime) {
		this.nomeTime = meuTime;
		
	}
	
	public void mostraTime() {
		System.out.printf("Seu time do coração é %s\n", getTime());
	
	}
	
}
