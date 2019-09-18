import java.util.Scanner;
import java.util.*;
import java.lang.String;

public class palindrome {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int scanned = scan.nextInt();
        int k=0,al,count=0;
        int temp =scanned;
        int temp2= scanned;
        while (temp!=0){
            temp=temp/10;
            ++count;
        }
        int[] palindrome = new int[count]; //
        do{
                palindrome[k] = temp2%10;
                temp2/=10;
                k++;
        }while (temp2!=0);
        int len= palindrome.length;


        int breaker=0;
        for(int i=0;i<=(len/2) && len!=0;i++){
            if (palindrome[i] != palindrome[len-i-1])
            {
                breaker =1;
                break;
            }
        }
        if (breaker==0){
            int sum=0;
            for(int i=0;i<len;i++)
            {
                if(palindrome[i]%2 == 0){
                    sum+=palindrome[i];
                }
            }
            if(sum > 25){
                System.out.println( scanned + "is a palindrome and the sum of even numbers is greater than 25" );
            }
            else{
                System.out.println( scanned + "is a palindrome and the sum of even numbers is less than 25" );
            }
        }

        else{
            System.out.println( scanned  + "is not a palindrome");
        }
    }
}
