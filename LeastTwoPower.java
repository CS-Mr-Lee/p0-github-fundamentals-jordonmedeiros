/* 
   Name: Jordon Medeiros
   Program Name: LeastTwoPower
   Date: 09/17/2021
   Program Discription: I input the data of birth of the user and then ask for the current date.
   I then find the amount of days the user lived and how many hours the user slept
*/

import java.util.*;
public class LeastTwoPower{
   public static void main(String[] args){
      
      //Here I declare the scanner
      Scanner input = new Scanner(System.in);
      
      //Here I declare the variables
      int num, placeHolder, loopCounter, exit;
      char exit;
      
      //Here I use a do while loop to allow the user to try again
      do{
      
         //Here I initliaze the variables
         num = 0;
         placeHolder = 2;
         loopCounter = 1;
         
         //here I prompt the user for the number
         System.out.print("Enter a number: ");
         num = input.nextInt();
         
         
         //Here I use a while loop to check all the power of two that is the closest to the number inputted by the user
         while(placeHolder <= num){
            placeHolder = placeHolder * 2;
            loopCounter++;
         }
         
         //Here I ouput the results
         System.out.println(loopCounter + " is the smallest power of two greater than or equal to " + num);
         
         //Here I ask the user if it wants to continue
         System.out.println("Press e to exit program and anything else to continue");
         exit = input.next().charAt(0);
      
      } while(exit != 'e');   
   }  
}