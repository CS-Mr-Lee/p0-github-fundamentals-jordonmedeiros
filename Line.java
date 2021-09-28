/*
Name: Jordon Medeiros
Program Name: Line
Date: 2021-09-24
Program discription: This program containes the two methods that get the length and slope of the line
*/



import java.util.*;
public class Line
{
   public static void main(String[] args){
      //In this paragraph, i create the scanner and the variables
      Scanner input = new Scanner(System.in);
      double len, slope;
      int x1, y1, x2, y2;

      
      //In this paragraph, I prompt the user for the coorinates of the line
      System.out.println("Please enter the two coordinates of the line");
      System.out.println("Vertex 1 x-value:	");
      x1 = input.nextInt();
      System.out.println("Vertex 1 y-value:	");
      y1 = input.nextInt();
      System.out.println("Vertex 2 x-value:	");
      x2 = input.nextInt();
      System.out.println("Vertex 2 y-value:	");
      y2 = input.nextInt();
      
      //In this paragraph, I call two methodst. The user input are the parameters.
      //This method gets the length
      len = length(x1, y1, x2, y2);
      //This method gets the slope
      slope = slope(x1, y1, x2, y2);

      //In this paragraph, I display the results
      System.out.println("The length is: " + len);
      System.out.println("The slope is: " + slope);
   }   
   /*
   Method Name: length(int x1, int y1, int x2, int y2)
   returns double - the length of the line
   int x1, int y1, int x2, int y2 - these are the parameters for the corrdinates of the line
   Method discription: This method takes the two points of the line and gets the length of the line
   */
   public static double length(int x1, int y1, int x2, int y2){
      //Here I declare the variable that will be returned
      double length;
      //Here I do the calculations to get the length
      length = Math.pow(y2-y1,2) + Math.pow(x2-x1,2);
      length = Math.sqrt(length);
      //Here I return the length
      return length;
   }
   
   /*
   Method Name: slope(int x1, int y1, int x2, int y2)
   returns double - the slope of the line
   int x1, int y1, int x2, int y2 - these are the parameters for the corrdinates of the line
   Method discription: This method takes the two points of the line and gets the slope of the line
   */
   public static double slope(int x1, int y1, int x2, int y2){
      //Here I declare the variable that will be returned
      double slope;
      
      //Here I do the calculations for the slope
      slope = (y2 - y1)/(x2 - x1);
      
      //Here I return the slope
      return slope;
   }

}