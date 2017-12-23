import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot x = new Robot();

	public static void main(String[] args) {
		x.hide();
		x.setSpeed(10);
		int a = JOptionPane.showOptionDialog(null, "What shape do you want?", "", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "square", "triangle", "circle" }, null);
		int b = JOptionPane.showOptionDialog(null, "What color do you want?", "", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "purple", "blue", "green", "yellow", "orange", "red" }, null);
		if (a == 0 && b == 5) {
			x.setPenColor(255, 0, 0);
			drawSquare();
		}
		if (a == 0 && b == 4) {
			x.setPenColor(255, 127, 0);
			drawSquare();
		}
		if (a == 0 && b == 3) {
			x.setPenColor(255, 255, 0);
			drawSquare();
		}
		if (a == 0 && b == 2) {
			x.setPenColor(0, 255, 0);
			drawSquare();
		}
		if (a == 0 && b == 1) {
			x.setPenColor(0, 0, 255);
			drawSquare();
		}
		if (a == 0 && b == 0) {
			x.setPenColor(127, 0, 255);
			drawSquare();
		}
		if (a == 1 && b == 5) {
			x.setPenColor(255, 0, 0);
			drawTriangle();
		}
		if (a == 1 && b == 4) {
			x.setPenColor(255, 127, 0);
			drawTriangle();
		}
		if (a == 1 && b == 3) {
			x.setPenColor(255, 255, 0);
			drawTriangle();
		}
		if (a == 1 && b == 2) {
			x.setPenColor(0, 255, 0);
			drawTriangle();
		}
		if (a == 1 && b == 1) {
			x.setPenColor(0, 0, 255);
			drawTriangle();
		}
		if (a == 1 && b == 0) {
			x.setPenColor(127, 0, 255);
			drawTriangle();
		}
		if (a == 2 && b == 5) {
			x.setPenColor(255, 0, 0);
			drawCircle();
		}
		if (a == 2 && b == 4) {
			x.setPenColor(255, 127, 0);
			drawCircle();
		}
		if (a == 2 && b == 3) {
			x.setPenColor(255, 255, 0);
			drawCircle();
		}
		if (a == 2 && b == 2) {
			x.setPenColor(0, 255, 0);
			drawCircle();
		}
		if (a == 2 && b == 1) {
			x.setPenColor(0, 0, 255);
			drawCircle();
		}
		if (a == 2 && b == 0) {
			x.setPenColor(127, 0, 255);
			drawCircle();
		}
	}

	private static void drawSquare() {
		x.penDown();
		x.move(90);
		x.turn(90);
		x.move(90);
		x.turn(90);
		x.move(90);
		x.turn(90);
		x.move(90);
		x.turn(90);
	}

	private static void drawTriangle() {
		x.penDown();
		x.turn(60);
		x.move(90);
		x.turn(120);
		x.move(90);
		x.turn(120);
		x.move(90);
	}

	private static void drawCircle() {
		x.penDown();
		for (int i = 0; i <= 360; i++) {
			x.turn(1);
			x.move(1);
		}
	}
}
