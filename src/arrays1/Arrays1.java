//Program to determine the smallest and the largest value of an array
package arrays1;

public class Arrays1 {
    
 public static void main(String[] args){
    int numbers[]= {0,1, 6, 4, 4, 3, 22,78,2};
    int largest= numbers[0];
    int smallest= numbers[0];
    
    for (int i = 1; i<numbers.length; i++){
        if(numbers[i]>largest){
            largest= numbers[i];
        }
        else if(numbers[i]<smallest){
            smallest= numbers[i];
            
            
        }
    }
    System.out.println("The largest value is " +largest);
    System.out.println("The smallest value is " + smallest);
    
 }
     
 }
 