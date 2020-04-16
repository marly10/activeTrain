// Import the whole package a complete java library
package lab2;

public class TrainSystem
{

	//Enumerations serve the purpose of representing a group of named constants in a programming language
	public enum TrainSelection
	{
	    X,
	    Y
	}

   //Enumerations serve the purpose of representing a group of named constants in a programming language.
	public enum MoveType
	{
	    Increment,
	    Decrement
	}
	
	//instance variables
	private Train X;
	private Train Y;
	
	// allows client to set beginning values
	public TrainSystem(Train x, Train y)
	{
		this.X = x;
		this.Y = y;
	}
	
	//toString to get string representation of an object
	public String toString()

	{	//padding for train
		String padding = "===============";

		//actual train converted into a char datatype. method converts the given string into a sequence of characters
		char[] track = "---------------".toCharArray();
		
		//if the train has collided then I print collided
		if (hasCollided())
		{
			return "";
		}
		//else to place the X Y on the actual Char datatype 
		else
		{
			track[Y.getPosition()] = 'Y';
			track[X.getPosition()] = 'X';
		}

		//prints the train with X Y location on it
		return padding + "\n" + new String(track) + "\n" + padding;
	}
	
	//public void that moves the train from place to place
	public void moveTrain(TrainSelection train, MoveType move)
	{
		//if X selected then train increments 
		if (train == TrainSelection.X)
		{
			if (move == MoveType.Increment)
			{
				X.increment();
			}

			//else decrements
			else
			{
				X.decrement();
			}
		}

		//if Y selected then train increments 
		else if (train == TrainSelection.Y)
		{
			if (move == MoveType.Increment)
			{
				Y.increment();
			}
			//else decrements
			else
			{
				Y.decrement();
			}
		}
		else
		{
			System.out.print("I could not find your choo choo, Sorry bruh!");
		}
	}
	
	//boolean that test to see if X Y are at the same location. Which returns a true or false return.
	public boolean hasCollided()
	{
		if (X.getPosition() == Y.getPosition())
		{
			return true;
		}
		return false;
	}
}