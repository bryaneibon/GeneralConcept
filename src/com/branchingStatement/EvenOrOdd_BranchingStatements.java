import java.util.Scanner;

public class EvenOrOdd_BranchingStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int naturalNumber;
        String sequence = "";
        String even = "even";
        String odd = "odd";

        do {
            naturalNumber = scan.nextInt();

            if (naturalNumber == 0) {
                break;
            } else if (naturalNumber % 2 == 0) {
                sequence = sequence + even + "\n";
            } else{
                sequence = sequence + odd + "\n";
            }
        }while (naturalNumber != 0);
        System.out.println(sequence);
    }
}
