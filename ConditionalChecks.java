import java.util.Scanner;

public class ConditionalChecks {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        if(n%2 !=0  && n>20 && n<30){
            System.out.println("Tom");
        }
        else
        {
            System.out.println("Jerry");
        }

    }


}
