import java.util.Scanner;

public class UnspecifiedScan {
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);

        int sum=0, count=0;
        String str =  obj.nextLine();
        String[] str2  = str.split(" ");
        for(int i=0; i<str2.length;i++){
            int k=Integer.parseInt(str2[i].trim());
            sum+=k;
        }
        System.out.println(sum);
    }
}
