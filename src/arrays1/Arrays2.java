//Program to get the smallest and largest values of the array
package arrays1;
import java.util.Scanner;
public class Arrays2 {
    
    static int totalNumber;
    static int num[];
 
    static int largest(int arr[]){
     int largestNumber = num[0];
     for (int i = 0; i<arr.length; i++){
         if(num [i] >largestNumber){
             largestNumber = num[i];
         }
         }
        return largestNumber; 
    }
     
    static int smallest(int arr[]){
        int smallestNumber = num[0];
     for (int i = 0; i<arr.length; i++){
         if(num [i] <smallestNumber){
            smallestNumber = num[i];
         }
     }
        return smallestNumber;
    }
      public static void main (String[] args){

Scanner input = new Scanner(System.in);
System.out.print("How many no do you want to enter in your array? ");
totalNumber = input.nextInt();
num = new int[totalNumber];
System.out.print("Enter values: ");
for (int i = 0; i<totalNumber; i++){
    num[i]= input.nextInt();
}

System.out.println("largest value is : " + largest(num));
System.out.println("Smallest value is: " +smallest(num));

}
      
}  
    
    
