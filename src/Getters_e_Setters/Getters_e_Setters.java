package Getters_e_Setters;
import java.util.Scanner;

public class Getters_e_Setters {
	
	public static void main(String[] args) {
		String time;
		Futebol torcida = new Futebol();
		Scanner texto = new Scanner(System.in);
				
		System.out.println("Para que time vc torce? ");
		time = texto.nextLine();
		
		torcida.setTime(time);
		torcida.mostraTime();
		
	}
}