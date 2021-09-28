
/*
Name: Jordon Medeiros
Program Name: Turtle2
Date: 2021-09-27
Program discription: This program draws the square
*/

public class turtle2 {
   public static void main(String[] a)
      {
      //here I create the turtle object
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(5);
      //here I use a loop to determin when to draw and when not to draw
      for(int i = 1; i <= 4; i++){
         for(int j = 0; j <= 25; j++){
            bob.forward(5);
            //Here I change the color of the turtle whenever it has to draw or not draw
            if(j < 5 || (j > 10 && j <16) || (j > 20 && j <=25)){
               bob.penColor("red");
            }else{
               bob.penColor("lightblue");
            }
         }
         bob.left(90);
    
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