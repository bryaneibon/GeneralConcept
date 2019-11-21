import java.util.Scanner;

public class SelectOneLoop_IteratingOverArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLengh = scan.nextInt();
        int [] myArray = new int [arrayLengh];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        int userChoice = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == userChoice){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
