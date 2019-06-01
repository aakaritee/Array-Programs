//Program to calculate the average of the arrays
package arrays1;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the no of arrays: ");
        int no = input.nextInt();
        
        //declare an array
        int[] arr = new int[3];
        
        int total = 0;
        /*test change */
        System.out.println("Enter the values of arrays you want to sum total of: ");
        
        for (int i =0; i<no; i++){
            arr[i]= input.nextInt();
            
        }
        for (int i :arr){
            total = total +i;
        }
        
       int average= 0;
       average = total/no;
        System.out.println("The average value of the array is : " + average);
        
}
}
