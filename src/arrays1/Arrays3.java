 
package arrays1;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the no of arrays: ");
        int no = input.nextInt();
        
        //declare an array
        int[] arr = new int[3];
        
        int total = 0;
        
        System.out.println("Enter the values of arrays you want to sum total of: ");
        
        for (int i =0; i<no; i++){
            arr[i]= input.nextInt();
            
        }
        for (int i :arr){
            total = total +i;
        }
        
        System.out.println("The sum of the array is : " + total);

}
}
