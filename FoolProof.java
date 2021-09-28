/*
Name: Jordon Medeiros
Program Name: FoolProof
Date: 2021-09-24
Program discription: This program ask the user to enter a numerator and divisor until a string that starts with a q is entered. An error message will be outputted if the divisor is a 0 or another string is entered but the program will continu
*/

import java.io.*;
import java.util.*;
public class FoolProof
{
   public static void main(String[] args)
   {
      //Here I create the scanner and the variables
      Scanner input = new Scanner(System.in);
      String divString, word;
      String numString = " ";
      int ans, div;
      int num = 0;
      boolean again = true;
      char firstChar;
      int hue = 0;
      
      //Here I use a do while to continue asking the user for input until the values the uner entered starts with a Q.
      do{
      
         //Here I use a try catch statement to make sure the user entered a number and the divider is not a 0
         try{
            
            //Here I prompt the user for the numerator and the divider
            System.out.print("Enter the numerator: ");
            numString= input.nextLine();
            //Here I convert the number to an integer. (If not number, will go to catch statement)
            num = Integer.parseInt(numString);
            System.out.print("Enter the divider: ");
            divString = input.nextLine();
            
            //Here I convert the divdor to an integer
            div = Integer.parseInt(divString);
            
            //Here I divide the two integers. (If div is 0, will go to catch statement)
            ans = num / div;
            
            //Here I print the result of the division
            System.out.println(num + " / " + div + " is " + ans + "\n");
            
         }catch(ArithmeticException e){
            //Here I print out the error message if the dividor is a 0.
            System.out.println("You cannot divide " + num + " by 0\n");
         }catch(NumberFormatException e){
            //Here I print out the error message if the numerator is a string
            //Here I get the first letter of the string
            firstChar = numString.charAt(0);
            
            //Here I use an if statement to end the loop if the first letter is a q or Q
            if(firstChar == 'q' || firstChar == 'Q'){
               again = false;     
            }else{
               //Here I tell the user to try again if the string does not start with q or Q
               System.out.println("You entered bad data.");   
               System.out.println("Please try again.\n");   
            }
            
         }
      }while(again == true);
   }
}