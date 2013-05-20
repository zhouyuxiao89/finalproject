
public class Biped extends Animal{
  private int _weight;
	private int _speed;
	private int _bodyLiftRatio;
	private int _acceleration;
	private int _distance;
	private int []array1 = new int[100];
	private int []array2 = new int[100];
public Biped(int acceleration, int bodyLiftRatio, int weight, int speed, String name, String gender, int age)
{
	super(name, gender, age);
	_weight = weight;
	_speed = speed;
	_bodyLiftRatio = bodyLiftRatio;
	_acceleration  = acceleration;
}
public void displayMessage()
{
	super.displayMessage();
	System.out.printf("Weight: %s pounds\n",_weight);
	System.out.printf("Speed: %s m/s\n", _speed);
	System.out.printf("Body-Lift Ratio: %d pounds\n", _bodyLiftRatio);
	System.out.printf("Acceleration:%d \n" , _acceleration);
}
public int walk(int t, int turntime)
{
    int i;
    int j;
    int x, y;
    for (i = 1; i <=  turntime; i++ )
    {
	array1[i] = _speed * i;
    }
    for (j = 1; j <= (t - turntime); j++ )
    {
    	if (turn("left"))
    	{
    	array2[j] = (_speed * j);	
    	}
    	else if (turn("right"))
    	{
    	array2[j] = -(_speed * j);	
    	}
    }
	x= _speed * turntime;
	y = _speed * (t-turntime);
	_distance = x + y;
	return _distance;
}

public int run(int t, int turntime)
{
	int i;
    int j;
    int x, y;
    for (i = 1; i <=  turntime; i++ )
    {
    	array1[i] = (_speed*i) + (1/2)*(_acceleration) * (i^2);	
    	_speed = _speed + _acceleration * i;
    }
    for (j = 1; j <= (t - turntime); j++ )
    {
    	if (turn("left"))
    	{
    	array2[j] = (_speed*j) + (1/2)*(_acceleration) * (j^2);	
    	_speed = _speed + _acceleration * j;
    	}
    	else if (turn("right"))
    	{
    	array2[j] = -(_speed + _speed * j);	
    	}
    }
	x= (_speed*turntime) + (1/2)*(_acceleration) * (turntime^2);
	y = ((_speed + (_acceleration * turntime)) * (t-turntime)) + (1/2)*(_acceleration) * ((t-turntime)^2);
	_distance = x + y;
	return _distance;
}

public void history(int t, int turntime)
{
	
	int i, j;
  	System.out.println("Positions for last ten seconds:");
  	for (i = 1; i <=  turntime; i++ )
  	{
  		System.out.print("(");
  		System.out.print(array1[i]);
  		System.out.print(",0");
  		System.out.print(")");
  		System.out.println();
  	}
  	for (j = 1; j <= (t - turntime); j++ )
  	{
  	System.out.print("(");
	System.out.print(array1[turntime]);
	System.out.print(",");
	System.out.print(array2[j]);
	System.out.print(")");
	System.out.println();
  	}
}

public boolean turn(String direction)
{
	
	if (direction.equalsIgnoreCase("left"))
	{
		return true;
	}
	else
	{
		return false;
	}
}

public void collide()
{
	_speed = 0;
	System.out.printf("Speed after collision is %d:", _speed);
}

}
