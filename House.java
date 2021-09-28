
/*
Name: Jordon Medeiros
Program Name: Turtle3
Date: 2021-09-27
Program discription: This program draws the house
*/
public class turtle3 {
   public static void main(String[] a)
      {
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(2);
      int speed = 5;
      //Here I draw the house
      for(int i = 1; i <= 30; i++){
          bob.forward(speed);
      }     
      bob.left(90);
      for(int i = 1; i <= 30; i++){
         bob.forward(speed);
      }
      bob.right(90);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }     
      bob.left(150);
      for(int i = 1; i <= 23; i++){
         bob.forward(speed);
      }
      bob.left(60);
      for(int i = 1; i <= 23; i++){
         bob.forward(speed);
      }
      bob.left(150);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }
      bob.right(90);
      for(int i = 1; i <= 30; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 3; i++){
         bob.forward(20);
      }
      bob.right(90);
      for(int i = 1; i <= 2; i++){
         bob.forward(10);
      }
      bob.right(90);
      for(int i = 1; i <= 3; i++){
         bob.forward(20);
      }
      bob.left(90);
      for(int i = 1; i <= 7; i++){
         bob.forward(speed);
      }
      for(int i = 1; i <= 1; i++){
         bob.forward(speed);
      }
      for(int i = 1; i <= 19; i++){
         bob.penColor("lightblue");
      bob.forward(speed);
      }
      bob.penColor("red");
      bob.right(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }  
      bob.left(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 5; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.left(90);
      for(int i = 1; i <= 6; i++){
         bob.penColor("red");
         bob.forward(speed);
      }
      for(int i = 1; i <= 4; i++){
         bob.penColor("lightblue");
         bob.forward(speed);
      }
      bob.penColor("red");
      //here I make the chimney
      for(int i = 1; i <= 10; i++){
         bob.forward(speed);
      }
      bob.right(90);
      for(int i = 1; i <= 4; i++){
         bob.forward(speed);
      }
      bob.right(90);
      for(int i = 1; i <= 12; i++){
         bob.forward(speed);
      }
/*possible codes:
bob.forward(distance)
bob.backward(distance)
bob.left(angle)
bob.right(angle)

bob.up()
bob.down()

bob.setDirection(angle)
bob.home()
bob.hide()
bob.show()
bob.face(x, y)
bob.setPosition(x, y)

bob.tilt(angle)
bob.width(width)
bob.penColor("colour")
bob.bgcolor("colour")
bob.stamp()
bob.dot()
bob.dot("colour")
bob.dot("colour", dotsize)
*/
   }
}