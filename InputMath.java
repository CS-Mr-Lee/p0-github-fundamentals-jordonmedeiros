/* 
   Name: Jordon Medeiros
   Program Name: InputSum
   Date: 09/16/2021
   Program Discription: I input the data of birth of the user and then ask for the current date.
   I then find the amount of days the user lived and how many hours the user slept
*/

import java.util.*;
public class InputMath{
   public static void main(String[] args){
      
      //Here I create the scanner object
      Scanner input = new Scanner(System.in);
      
      //Here I declare all the variables
      int birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay, daysAlive, hoursSlept;
      
      //Here I prompt the user for its birthdate
      System.out.println("Enter your birthdate: ");
      System.out.print("Year: ");
      birthYear = input.nextInt();
      System.out.print("Month: ");
      birthMonth = input.nextInt();
      System.out.print("Day: ");
      birthDay = input.nextInt();
      
      //Here I prompt the suer for the currrent date
      System.out.println("Enter today's date: ");
      System.out.print("Year: ");
      currentYear = input.nextInt();
      System.out.print("Month: ");
      currentMonth = input.nextInt();
      System.out.print("Day: ");
      currentDay = input.nextInt();
      
      //Here I calculate how many days the user has been alive for by coverting all the dates into days and subtrating the current date by the date of birth
      daysAlive = ((currentYear * 365 + currentMonth * 30 + currentDay) - (birthYear * 365 + birthMonth * 30 + birthDay));
      
      //Here I calculate how many hours the user has slept by mutipling the amount of days the user lived by 8
      hoursSlept = daysAlive * 8;
      
      //Here I output how many days the user has been alive for
      System.out.println("You have been alive for " + daysAlive + " days.");
      //Here I output how many hours the user has been alive for
      System.out.print("You have slept " + hoursSlept + " hours.");
      
      
   
   }
}