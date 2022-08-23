package org.launchcode.java.studios.areaofacircle;
 import javafx.scene.shape.Circle;

 import java.util.InputMismatchException;
 import java.util.Scanner;

public class Area {

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  boolean incorrectInput = true;
  double radius=0;

  while (incorrectInput) {
   System.out.println("Enter the Radius: ");

   try {
     radius = Double.parseDouble(input.nextLine());
     if (radius <= 0) {
      System.out.println("Incorrect Input. Please enter a positive integer or double");
     }
     else
     {
      incorrectInput = false;
     }
   } catch (NumberFormatException e) {
    System.out.println("Incorrect Input. Please enter a positive integer or double");
   }

  }
   double area = circle.getArea(radius);
   System.out.println("The Area Of The Circle Is  " + area);
   input.close();

 }

}
