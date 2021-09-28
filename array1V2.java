/*
Name: Jordon Medeiros
Program Name: array1V2
Date: 2021-09-27
Program discription: This program inputs 14 strings from the user and puts them in reverse order in the same array
*/

import java.util.*;

public class array1V2{
   public static void main(String[] args){
      //Here I create the scanner and the array and the variables
      Scanner sc = new Scanner(System.in);
      final int ARRAY_VALUES = 14;
      String[] array = new String[ARRAY_VALUES];
      String placeHolder;
      
      //Here get user input and put them in the array
      for(int i = 0; i < ARRAY_VALUES; i++){
         System.out.print("Enter value #" + (i + 1) + " for the array: ");
         array[i] = sc.nextLine();
      }
      
      //Here I put the values of the array in reverse
      for(int i = 0; i < ARRAY_VALUES/2; i++){
         placeHolder = array[i];                   //Here I store the old value of the array in the place holder variable
         array[i] = array[ARRAY_VALUES-1 - i];     //I then put the value of the reverse into the new postion
         array[ARRAY_VALUES-1 - i] = placeHolder;  //I then put the value in the place holder into the reversed postion
      }
      
      //Here I ouput the values of the array
      for(int i = 0; i < ARRAY_VALUES; i++){
         System.out.println(array[i]);
      }  
   }
}