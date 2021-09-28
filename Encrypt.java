/*
Name: Jordon Medeiros
Program Name: Encrypt
Date: 2021-09-27
Program discription: This program ask the user to enter a string and it then encrypts the string using the intructions provided
*/

import java.util.*;

public class Encrypt{
   public static void main(String[] args){
      //Here I create the scanner and declare the variables
      Scanner sc = new Scanner(System.in);
      String word;
      
      //Here I prompt the user for line
      System.out.println("Enter a line");
      word = sc.nextLine();
      int wordLen = word.length();                 //Here I get the length of the string for the arrays
      char[] list = new char[wordLen];             //This array is for the original line
      char[] newList = new char[wordLen];          //This array is for the encrptyed line
      int[] spacePos = new int[wordLen+2];         //This Array is for the representation of the string in numbers to help determin what to do with thecharacters in the line
      char[] letters = new char [2];               //This array is for the letters that are to be swicthed
      int[] lettersPos = new int[2];               //This array is for the position of the letters to be swicthed
      int letterShiftByTwo = 0;
      
      //Here I add the buffer for the start and end of the string in the array "spacePos" to help determin when the loop should start and stop seaching for letters
      //3 represents the start of the string and 4 represents the end of the string
      spacePos[0] = 3;
      spacePos[wordLen+1] = 4;
      
      //Here I insert the word into the array
      for(int i = 0; i < wordLen; i++){
         list[i] = word.charAt(i);   
      }
         //I use numbers inside the array "spacepos" to represent spaces,
         //Here I use 0 in the array to represent the space and 1 to represent a letter
         for(int i = 1; i < wordLen+1; i++){
            if(word.charAt(i-1) == ' '){
               spacePos[i] = 0;
            }else{
               spacePos[i] = 1;
            }
         }

         //I used numbers in the "spacepos" array to represent the elements of the string
         //0 represents a space
         //1 represents a letter
         //3 represents the start of the string
         //4 represents the end of the string
         //Here I check each spot of the position array
         for(int i = 1; i < wordLen+1; i++){
            //This if statement checks if the values in the array are a letter
            if(spacePos[i]== 1){
            //If the letter, which is represented by 1, is encloseded by a 3 and 0, or a 3 and 4, or a 0 and 0, or a 0 and 4 the letter will be left alone
            if(spacePos[i] == 1 && spacePos[i-1] == 3 && spacePos[i+1] == 0 || spacePos[i] == 1 && spacePos[i-1] == 3 && spacePos[i+1] == 4 || spacePos[i] == 1 && spacePos[i-1] == 0 && spacePos[i+1] == 0 || spacePos[i] == 1 && spacePos[i-1] == 0 && spacePos[i+1] == 4){
  
               newList[i-1] = list[i -1];
            //If the letter is after a 3 or 0, it will saved as a first letter to be swicthed
            }else if(spacePos[i-1] == 3 || spacePos[i-1] == 0 ){ //&& (spacePos[i+1] != 0 || spacePos[i+1] != 4)){
               //Here I store the letter and the poistion of the letter
               letters[0] = list[i-1];
               lettersPos[1] = (i-1);
            }
            //If the letter is before a 0 or 4, it iwll be saved as a last letter to be swicthed
            else if((spacePos[i+1] == 0 || spacePos[i+1] == 4)){        
               //Here I store the letter and the poistion of the letter         
               letters[1] = list[i-1];
               lettersPos[0] = (i-1);
               //Here I swicth the two letters
               for(int x = 0; x < 2; x++){
                  newList[lettersPos[x]] = letters[x];
               }
            //If the letter is surrounded by other letters, then it will be moved up 2 digits in the ascii table
            }else if(spacePos[i] == 1 && spacePos[i-1] == 1 && spacePos[i+1] == 1 ){
               //Here I convert the letter to an integer to move it two digits up and back into a character to insert it into the new array
               letterShiftByTwo = (int)list[i -1];
               letterShiftByTwo = letterShiftByTwo +2;
               newList[i-1] = (char) letterShiftByTwo;
            }
         }
      }
      //here I output the new string
      for(int i = 0; i < wordLen; i++){
         System.out.print(newList[i] + ", ");
      }
   }
}
