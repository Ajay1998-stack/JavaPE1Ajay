import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String sr = scan.nextLine();
        int len= sr.length();
        char temp;

        char[] array = sr.toCharArray();
        for(int i=0;i<len/2;i++)
        {
            temp=  array[i];
            array[i]= array[len-i-1];
            array[len-i-1]= temp;
        }

        for(int k=0;k<len;k++){
            System.out.print(array[k]);
        }
    }
}
