package enumerateur;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class EnumType {

	static BufferedReader keyboard = new BufferedReader ( new InputStreamReader(System.in) );
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	MesFeux feu = MesFeux.VERT;
	
	System.out.print("Que voulez-vous faire: (passer, attendre) : ");
	
	String action = keyboard.readLine();
	
	if (action.equals("passer")) {
		if (feu != MesFeux.VERT) {
			System.out.println("Vous ne pouvez pas passer car le feu n''est pas vert");	
		} else {
			System.out.println("Bonne Route");		
		}
	}	
	else if (action.equals("attendre")) {
		if (feu == MesFeux.VERT) {
			System.out.println("Vous devez passer, les autres attendent derriere vous !!!");	
		} else {
			System.out.println("Bonne Initiative");
			
		}
	}
	else {
		System.out.println("Commande Inconnue");
	}

  }
}
