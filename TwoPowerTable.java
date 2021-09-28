/*
Name: Jordon Medeiros
Program Name: TwoPowerTable
Date: 2021-09-27
Program discription: This program ask the user to enter a number and then it finds all the powers of two where the maximum power is that number. The result is outputted as a table in an html document
*/
import java.util.*;
import java.io.*;

public class TwoPowerTable{
   public static void main(String[] args){
      //Here I declare the scanner and the variables
      Scanner sc = new Scanner(System.in);
      String fileName = "output.html";
      boolean badInput = true;
      int power = 2;
      int num = 0;
      
      //here I use a do while loop to prompt the user to input another value if the input was invalid
      do{
         //Here I use a try catch statment to make sure the user only inputs numbers
         try{   
            //Here I ask the user for the number
            System.out.print("Enter an integer: ");
            num = sc.nextInt();
            badInput = false;
         }catch(InputMismatchException e){
            //Here I tell the user if the input is invalid
            System.out.println("Not valid input");
            sc.nextLine();
         }
      }while(badInput == true);
      
      //Here I use a try catch statment for the buffered writer
      try{
         //Here I create the buffered writer
         BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
         //Here I write the stuff
         writer.write("<html><head>");
         writer.write("<title>Power of two</title>");
         writer.write("</head>");
         writer.write("<body>");
         writer.write("<table border cellpadding=5>");
         writer.write("<tr><th>Power of 2</th><th>Value</th></tr>");
         writer.write("<tr><td>0</td><td>1</td></tr>");
         
         //Here I use the for loop to output all the powers of two where the power is less than or equal to the number
         for(int i = 1; i <= num; i++ ){
            writer.write("<tr><td>" + i + "</td><td>" + power + "</td></tr>");
            power = power*2;
         }
         
         writer.write("</table>");
         writer.write("</body></html>");
         writer.close();                           //Here I close the writer

      //Here I tell the user if there was a problem writing the file   
      }catch(IOException e){
         System.out.println("A problem writing the file");
      }
   }
}