import java.util.Scanner;

public class Multiplies {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        int len= str.length();
        char[] array = str.toCharArray();
        System.out.print(array);

        for(int i=0;i<n;i++)
        {
            for(int j=len-n;j<len;j++)
            {
            System.out.print(array[j]);
            }
        }

    }
}
