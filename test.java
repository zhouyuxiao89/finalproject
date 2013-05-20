
public class Test {

  public static void main(String[] args) {
		//Test for human
		Human human = new Human(3, 80,70, 5, "Joe","Male", 22);
		human.displayMessage();
		human.talk();
		//Test for Monkey
		Monkey monkey = new Monkey(2, 100, 80, 3, "Paul","Male", 3);
		monkey.displayMessage();
		monkey.talk();
		//Test for Robot
		Robot robot = new Robot(0, 120, 100, 1, "RobotX", "No gender", 1);
		robot.displayMessage();
		robot.talk();
		//--------------------------------------------
		//call turn method for human
		human.turn("left");
		//call walk method for human
		human.walk(10, 2);
		//Display total distances travelled for human
		System.out.printf("Total distance travalled is: %dm\n", human.walk(10,2));
		//display human positions for last ten seconds;
		human.history(10, 2);
		System.out.println();
		//-------------------------------------
		//call turn method for monkey
		human.turn("left");
		//call run method for monkey
		monkey.run(10, 2);
		//Display total distances travelled for monkey
		System.out.printf("Total distance travalled is: %dm\n", monkey.run(10,2));
		//display monkey positions for last ten seconds;
		monkey.history(10, 2);
		System.out.println();
		//--------------------------------------------------------
		//call turn method for robot
		robot.turn("left");
		//call run method for robot
		robot.run(10, 2);
		//Display total distances travelled for robot
		System.out.printf("Total distance travalled is: %dm\n", robot.run(10,2));
		//display robot positions for last ten seconds;
		robot.history(10, 2);
		System.out.println();	
	}
}
