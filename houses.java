import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot trash=new Robot();
	
public static void main(String[] args) {
	
	start();
	drawHouse(100);
	drawHouse(200);
	drawHouse (300);
	drawHouse(100);
	drawHouse(200);
	drawHouse (300);
	drawHouse(100);
	drawHouse(200);
	drawHouse (300);
	drawHouse(100);
	
	

}
static void start() {
	trash.setSpeed(100000000);
trash.setX(0);
trash.setY(500);
}

	static void drawHouse(int height) {
		
		trash.penDown();
		trash.setPenColor(Color.BLACK);
	trash.move(height);	
	trash.turn(90);
	trash.move(25);
	trash.turn(90);
	trash.move(height);
	trash.turn(270);
	trash.setPenColor(Color. GREEN);
	trash.move(50);
	trash.turn(270);
	}
}

