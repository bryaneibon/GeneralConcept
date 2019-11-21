import java.util.Scanner;

/**
 * A detector compares the size of parts produced by a machine with the reference standard.
 *
 * If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
 * If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
 * If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
 *
 * Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
 * The program should output numbers in a single line containing the number of parts ready to be shipped,
 * the number of parts to be fixed, and the number of rejects.
 ******************************************************************************************************************************
 * Un détecteur compare la taille des pièces produites par une machine au standard de référence.
 *
 * Si la taille de la pièce est plus grande, il peut être envoyé pour être corrigé et le détecteur imprime le numéro 1.
 * Si la taille de la pièce est plus petite, elle est supprimée et le détecteur imprime le nombre -1.
 * Si la pièce est parfaite, elle est envoyée à la boîte avec les produits prêts à être livrés et le détecteur enregistre 0.
 *
 * Ecrivez un programme qui prend en entrée le nombre de parties n, puis la séquence d’impressions du détecteur.
 * Le programme doit afficher les numéros sur une seule ligne contenant le nombre de pièces prêtes à être expédiées,
 * le nombre de pièces à fixer et le nombre de rejets.
 *
 * Sample Input 1:
 * 14
 * 0
 * -1
 * -1
 * 1
 * 0
 * 0
 * 0
 * 0
 * 0
 * 1
 * 0
 * -1
 * 1
 * -1
 * Sample Output 1:
 * 7 3 4
 */
public class SizeOfParts_TheForLoop {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int totalParts = scan.nextInt();
        int partsState;

        int readyToBeShipped = 0;
        int partsToBeFixed   = 0;
        int partsRejected    = 0;

        for (int i = totalParts; i > 0; i--) {
            partsState = scan.nextInt();
            if (partsState == 1) {
                partsToBeFixed += 1;
            }
            else if (partsState == -1){
                partsRejected += 1;
            }
            else if (partsState == 0){
                readyToBeShipped += 1;
            }
            else{
                continue;
            }
        }
        System.out.println(readyToBeShipped + " " + partsToBeFixed + " " + partsRejected);
    }
}
