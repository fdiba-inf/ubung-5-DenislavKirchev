package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        
        
        
        for (int index = 0; index < numbers.length; index++) {
          for(int i = 0; i < numbers.length; i++){
            if(uniqueNumbers[i]==0){
              uniqueNumbers[i]=numbers[index];
              break;
            }else if(uniqueNumbers[i]==numbers[index]){
              break;
            }
          }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
