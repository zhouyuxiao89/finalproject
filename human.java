
public class Human extends Biped{
  public Human(int acceleration, int bodyLiftRatio, int weight, int speed, String name, String gender, int age)
	{
		super(acceleration, bodyLiftRatio, weight, speed, name, gender, age);
	}
public void displayMessage()
{
	System.out.println("Human information:");
	super.displayMessage();	
}

public void talk()
{
	System.out.println("Human says: Hello, how are you?\n\n ");
}

}
