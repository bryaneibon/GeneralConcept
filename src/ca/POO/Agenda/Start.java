package ca.POO.Agenda;

import java.util.ArrayList;

public class Start {
    public static void main( String [] args ) {

        Client aClient = new Client();
        aClient.setIdentifier( 0 );
        aClient.setFirstName( "John" );
        aClient.setLastName( "Doe" );
        aClient.setEmail( "doe@unknown.com" );
        aClient.setEnterpriseName("INTACT Assurance");

        System.out.println( aClient );   
        
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add( new Person() );
        persons.add( new Employee( 1, "Jason", "Bourne", "supremacy@cia.us", 10_000 ) );
        persons.add( new Client( 7, "James", "Bond", "007@mi6.uk", "MI6" ) );
        
        for( Person person : persons ) {
            System.out.println( person );
        }
        
        System.out.println("\n------------------------------\n");
        
        // Certe on a uniquement des personnes mais on souhaite n'afficher que les employes de Person et pas les Clients.
        for (Person person : persons) {
        	//if (person instanceof Employee) {
        		System.out.println(person);
        	//}
			
		}
  }
}
