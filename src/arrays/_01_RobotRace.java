package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robs = new Robot[5];
	Random ran = new Random();
	for(int i=0; i<robs.length; i++) {
		robs[i] = new Robot();
		robs[i].setY(800);
		robs[i].setX(i*100 + 650);
		robs[i].setSpeed(100);
		robs[i].setWindowSize(1920, 1080);
	}
	boolean finished = false;
	while (!finished) {
		for(int i=0; i<robs.length; i++) {
			robs[i].move(ran.nextInt(50));
			if(robs[i].getY()<=0) {
				JOptionPane.showMessageDialog(null, "robot " + (i+1) + " is the winner! yay!");
				finished = true;
			}
		}
	}
	
	
	
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
