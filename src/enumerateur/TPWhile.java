package enumerateur;
import java.util.Scanner;

public class TPWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        System.out.println( "**** Super Car Remote - V1.0 ****\n" );
        System.out.println( "****commandes Permises : avancer, reculer, accelerer, decelerer, exit ****\n" );
        
        try (Scanner scan = new Scanner(System.in)){
		
        	int vitesse = 0;
        	Directions mouvement = Directions.FORWARD;
		
        	boolean DoitAvancer = true;
		
        	while(DoitAvancer) {
            	System.out.print("Entrez une Vitesse (Ou une commande) : ");
            	String commande = scan.nextLine();
            	
            	switch (commande) {
				case "avancer":
					mouvement = Directions.FORWARD;
					System.out.println("Nous sommes en mode Drive");
					break;
				case "reculer":
					mouvement = Directions.BACKWARD;
					System.out.println("Nous sommes en mode Reculer");
					break;
				case "accelerer":
					vitesse +=10;
					System.out.println("Nous accelerons. notre vitesse est: " + vitesse);
					break;
				case "decelerer":
					vitesse -=10;
					if (vitesse < 0) vitesse = 0;
					System.out.println("Nous decelerons. notre vitesse est: " + vitesse);
					break;
				case "exit":
					DoitAvancer = false;
					break;
				default:
					throw new IllegalArgumentException("Commande Inconnue: " + commande);
				}
            	if ( vitesse != 0 ) {
                    System.out.println( "Votre voiture est en mode " + mouvement  + " avec une vitesse de " + vitesse + "km/h");
                } else {
                    System.out.println( "Votre voiture est a l'arret" );
                    }

            }
            System.out.println( "Bye bye" );
        }
	    
    }
	
}
