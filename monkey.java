
public class Monkey extends Biped{

  public Monkey(int acceleration, int bodyLiftRatio, int weight, int speed, String name, String gender, int age)
	{
		super(acceleration, bodyLiftRatio, weight, speed, name, gender, age);
	}
	public void displayMessage()
	{
		System.out.println("Monkey information:");
		super.displayMessage();		
	}
	public void talk()
	{
		System.out.println("Monkey says: AH,AH,AH\n\n");
	}
	
}

