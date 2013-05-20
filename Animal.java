
public class Animal {
  private String _name;
	private String _gender;
	private int _age;
	public Animal(String name, String gender, int age)
	{
		_name = name;
		_gender = gender;
		_age = age;
	}
	public void displayMessage()
	{
		System.out.printf("Name: %s\n", _name);
		System.out.printf("Gender: %s\n", _gender);
		System.out.printf("Age: %s\n", _age);
	}
}
