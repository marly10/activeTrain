/**
 Ricky McKenzie
 Lab2 
 */
 
 //Import the whole package a complete java library
package lab2;

import java.util.*;

//imports the unique section from the entire helloworld package same as -java.util.Scanner;- 
import lab2.TrainSystem.MoveType;
import lab2.TrainSystem.TrainSelection;

public class TrainClient {

	public static void main(String[] args) {
   
   
   //starting location
		Train x = new Train(3);
		Train y = new Train(8);
      
		TrainSystem tSystem = new TrainSystem(x, y);
      
		System.out.println(tSystem.toString());
      
		Scanner keyboard = new Scanner(System.in);
		
		while (tSystem.hasCollided() == false)
		{
			System.out.print("Move the X train left (enter L) or right (enter R)?: ");
         
         //gets the R || L entry
			String xMovement = keyboard.next();
         
         // if R L entered in lowercase will be converted to upper
         String xMovementUpper = xMovement.toUpperCase();
         
			if (xMovementUpper.equals("R")) {
         
        //If statment that validates the data that was entered, and if equals L we run the parameters expected Increment
				tSystem.moveTrain(TrainSelection.X, MoveType.Increment);
			} 
         
        //If statment that validates the data that was entered, and if equals L we run the parameters expected Decrement
         else if (xMovementUpper.equals("L")) {
				tSystem.moveTrain(TrainSelection.X, MoveType.Decrement);
			} 
         
         //IF NOTHING THEN WE REMIND we need data
         else {
				System.out.println("Sorry please add the right thing for me to run.");
			}
         
         //prints toString data
			System.out.println(tSystem.toString());
         
         //if and only if the trains collide we print
			if (tSystem.hasCollided()) {
         
				System.out.println("CRASH!!!");
            
            //Stops the program from running
				break;
			}
			
			System.out.print("Move the Y train left (enter L) or right (enter R)?: ");
         
         //gets the R || L entry
			String yMovement = keyboard.next();
         
        // if R L entered in lowercase will be converted to upper
         String yMovementUpper = yMovement.toUpperCase();
         
         //If statment that validates the data that was entered, and if equals R we run the parameters expected
			if (yMovementUpper.equals("R")) 
         {
         //if R entered this side increments
				tSystem.moveTrain(TrainSelection.Y, MoveType.Increment);
            
			} 
         
        //If statment that validates the data that was entered, and if equals L we run the parameters expected Decrement
         else if (yMovement.equals("L")) {
         
				tSystem.moveTrain(TrainSelection.Y, MoveType.Decrement);
			} 
         
         else {
				System.out.println("Sorry please add the right thing for me to run.");
			}
			
         System.out.println(tSystem.toString());
		}
      
      //add the number of times X Y where moved then adds them together.
		int totalMovementSystem = x.getTimesMoved() + y.getTimesMoved();
		System.out.println("Moves before crash: " + totalMovementSystem);
	}
}