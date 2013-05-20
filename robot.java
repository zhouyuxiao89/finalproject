
public class Robot extends Biped{

  public Robot(int acceleration, int bodyLiftRatio, int weight, int speed, String name, String gender, int age)
	{
		super(acceleration, bodyLiftRatio, weight, speed, name, gender, age);
	}
	public void displayMessage()
	{
		System.out.println("Robot information:");
		super.displayMessage();		
	}
	public void talk()
	{
		System.out.println("Robot says: I am a robot come from future~\n\n");
	}
	
}

