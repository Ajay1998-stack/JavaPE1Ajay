import java.util.Scanner;

public class Consonant {
    public static void main(String args[]){
        Scanner  scan = new Scanner(System.in);
        String scanned = scan.nextLine();
        int n=0;
        while (n!= scanned.length())
        {
            char x;
            x= scanned.charAt(n);

            if (x == 'a' || x == 'e' || x == 'i' ||
                    x == 'o' || x == 'u' || x == 'A' ||
                    x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }

            n++;

        }
    }
}
