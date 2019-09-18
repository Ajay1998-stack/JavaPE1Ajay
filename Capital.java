import java.util.Scanner;

public class Capital {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        char cap = obj.next().charAt(0);
        int i= cap;
        if(i>65 && i<90){
            System.out.println("Capital");
        }
        else if(i>97 && i<122){
            System.out.println("Small Case");
        }

        else if(i> 48 && i< 57) {
            System.out.println("digit");
        }

        else
            System.out.println("special Charecter");
    }
}
