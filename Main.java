import java.lang.annotation.Target;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("1:Palindrome \t 2: Tom n Jerry in 20s \t 3:Vowel n Consonant \n 4:Iteration \t 5:Sum of Integers \t" +
                    "6:Indentify Char \t 7:Sort Integer \n 8:Guess Number \t 9:Reverse String \t 10:String Repeat \t 11:Exit");
            System.out.println("Select an option:-");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            String dummy[] = {};
            switch (num) {
                case 1:
                    palindrome.main(dummy);
                    break;
                case 2:
                    ConditionalChecks.main(dummy);
                    break;
                case 3:
                    Consonant.main(dummy);
                    break;
                case 4:
                    Iteration.main(dummy);
                case 5:
                    UnspecifiedScan.main(dummy);
                    break;
                case 6:
                    Capital.main(dummy);
                    break;
                case 7:
                    Sort.main(dummy);
                    break;
                case 8:
                    Guess.main(dummy);
                    break;
                case 9:
                    Reverse.main(dummy);
                    break;
                case 10:
                    Multiplies.main(dummy);
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Enter a valid Choice");
            }
        }

    }
}
