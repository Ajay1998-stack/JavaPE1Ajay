import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int temp1,temp2,i=0, temp3= 0,count=0;
        int sum=0;
        temp2 = n;
        while(temp2!=0){
            temp2/=10;
            ++count;
        }
        int[] arr= new int[count];
        int[] arr2 = new int[count];
        temp1= n;

        do {
            arr[count-i-1] = temp1%10;
            temp1/=10;
            i++;
        }while(temp1!=0);


        Arrays.sort(arr);
        System.out.print("Sorted number in non-increasing order :");
        for(int e=0;e<count;e++){
            System.out.print(arr[count-e-1]);
        }

        System.out.println();

        for(int r=0;r< count;r++){
            if(arr[r]%2 == 0){
                sum = sum+ arr[r];
            }
        }
         System.out.println("Sum of  even numbers is"+sum);

        if(sum>15){
            System.out.println("True");
        }
        else
            System.out.println("False");




    }
}
