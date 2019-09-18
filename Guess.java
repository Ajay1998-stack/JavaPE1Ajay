import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String args[])
    {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();

        // create instance of Random class
        Random rand = new Random();


        // Generate random integers in range 0 to 99
        int rand_int1 = rand.nextInt(100);
        System.out.println(rand_int1);

        while(true){
            if (n == rand_int1) {
                System.out.println("Number guessed is the original number");
                break;
            }
            else if (n > rand_int1) {
                System.out.println("Number guessed is more than original number");
                n = scan.nextInt();
            }
            else if (n < rand_int1) {
                System.out.println("Number guessed is less than original number");
                n = scan.nextInt();
            }
        }


    }
}
