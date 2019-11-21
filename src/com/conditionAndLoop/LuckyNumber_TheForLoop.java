import java.util.Scanner;

/**
 * Typical task for a job interview.
 * ----------------------------------------
 * Given the number N with an even number of digits.
 * If the sum of the first half of the digits equals the sum of the second half of the digits,
 * then this number is considered lucky. For a given number, output "YES" if this number is lucky,
 * otherwise output "NO".
 *
 * Sample Input 1:
 * 12344321
 * Sample Output 1:
 * YES
 * Sample Input 2:
 * 125322
 * Sample Output 2:
 * NO
 */
public class LuckyNumber_TheForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String luckyNumber = scan.next();
        int sum1 = 0;
        int sum2 = 0;
        String part1 = luckyNumber.substring(0,luckyNumber.length()/2);
        String part2 = luckyNumber.substring(luckyNumber.length()/2,luckyNumber.length());

        String s;
        int entier;

        char[] ch = part1.toCharArray();
        char[] ch2 = part2.toCharArray();

        int length1 = ch.length;
        int length2 = ch.length;

        for(int i=0;i<length1;i++){
            s = String.valueOf(ch[i]);
            entier = Integer.parseInt(s);
            sum1 = sum1 + entier;
        }
        System.out.println(sum1);

        for(int i=0;i<length2;i++){
            s = String.valueOf(ch2[i]);
            entier = Integer.parseInt(s);
            sum2 = sum2 + entier;
        }
        System.out.println(sum2);

        if(sum1 == sum2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
