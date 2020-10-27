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
        
        uniqueNumbers[0] = numbers[0];
        int uniqueIndex=1;
        for (int index = 1; index < numbers.length; index++) {
          
          if(numbers[index]!=numbers[index-1]){
            uniqueNumbers[uniqueIndex]=numbers[index];
            uniqueIndex++;
          }  
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
