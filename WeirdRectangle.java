/*
Name: Jordon Medeiros
Program Name: Turtle1
Date: 2021-09-27
Program discription: This program draws a rectangle
*/


import java.util.*;

public class turtle1{
   public static void main(String[] a)
   {
      //Here I create he object bob
      Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      bob.bgcolor("lightblue");
      bob.penColor("red");
      //Here I draw the rectangle
      bob.width(5);
      bob.forward(100);
      bob.left(90);
      bob.forward(100);
      bob.left(90);
      bob.forward(30);
      bob.left(90);
      bob.forward(30);
      bob.right(90);
      bob.forward(70);
      bob.left(90);
      bob.forward(70);

      
      
   }
}