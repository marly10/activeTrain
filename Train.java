//Import the whole package a complete java library
package lab2;

//class name
public class Train
{
	//instance variables
	private int mPosition;
	private int mTimesMoved;

	//getters method start
	public int getPosition()
	{
		return this.mPosition;
	}

	//decrement method and the collection of statements giving to follow
	public void decrement()
	{
		mPosition--;
		if (mPosition < 0)
		{
			mPosition = 14;
		}
		this.mTimesMoved++;
	}

	//increment method and the collection of statements giving to follow
	public void increment()
	{
		mPosition++;
		if (mPosition > 14)
		{
			mPosition = 0;
		}
		this.mTimesMoved++;
	}
	
		//getters method start
	public int getTimesMoved()
	{
		return this.mTimesMoved;
	}

//Constructor being passed with position parametor added
	public Train(int position)
	{
		System.out.println("choo choo!");
		
		this.mPosition = position;
		this.mTimesMoved = 0;
	}
}
