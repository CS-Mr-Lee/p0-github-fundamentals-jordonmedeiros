/*
Name: Jordon Medeiros
Program Name: Shapes
Date: 2021-09-27
Program discription: This program draws a sqaure
*/


import java.util.*;

public class turtle4 {
   public static void main(String[] a)
   {
      //Here I create he objects and scanner and variables
      Turtle bob = new Turtle();
      Scanner sc = new Scanner(System.in);
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      bob.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(5);
      int num, count;
      //Here I prompt the user for the lentgh of the square
      System.out.print("Enter the square length: ");
      num = sc.nextInt();
      //here I draw the square
      for(int i = 0; i < num; i++)
         {
            for(int x = 0; x < num; x++)
            {
               bob.forward(10);
            }
            if (i%2 == 0)
            {
               if(i != num-1){
                  bob.left(90);
                  bob.forward(10);
                  bob.left(90);
               }
            }
            else
            {
               bob.right(90);
               bob.forward(10);
               bob.right(90);
            }

      
         }
      
      
   }
}