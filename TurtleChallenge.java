/*
Name: Jordon Medeiros
Program Name: Turtle5
Date: 2021-09-27
Program discription: This program draws a staircase that increases its deminsions every step
*/


import java.util.*;

public class turtle5 {
   public static void main(String[] a)
   {
      Turtle bob = new Turtle();
      Scanner sc = new Scanner(System.in);
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      bob.bgcolor("lightblue");
      bob.penColor("black");
      bob.width(5);
      int modChecker, turner;
      
      for(int frequency = 0; frequency < 10; frequency++)
      {
         for(int degreeChange = 0; degreeChange < 100; degreeChange++)
         {
            modChecker = degreeChange % 2;
            turner = 90 ;
            if (modChecker == 0)
            {
               bob.left(turner);
            }
            else
            {
               bob.right(turner);
            }
            for(int run = 10; run < degreeChange; run++)
            {
              bob.forward(10);
            }
         }
      }
      
      
      
   }
}