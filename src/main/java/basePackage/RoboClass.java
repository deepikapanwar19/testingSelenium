package basePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RoboClass {

	private Robot robo;

	public RoboClass() throws AWTException {
		robo = new Robot();
	}

	public void pressAndReleaseNumbersOnKeyBoard(int keyCode) {
		switch (keyCode) {

		case 0:
			robo.keyPress(KeyEvent.VK_0);
			robo.keyRelease(KeyEvent.VK_0);
			break;
		case 1:
			robo.keyPress(KeyEvent.VK_1);
			robo.keyRelease(KeyEvent.VK_1);
			break;
		case 2:
			robo.keyPress(KeyEvent.VK_2);
			robo.keyRelease(KeyEvent.VK_2);
			break;
		case 3:
			robo.keyPress(KeyEvent.VK_3);
			robo.keyRelease(KeyEvent.VK_3);
			break;
		case 4:
			robo.keyPress(KeyEvent.VK_4);
			robo.keyRelease(KeyEvent.VK_4);
			break;
		case 5:
			robo.keyPress(KeyEvent.VK_5);
			robo.keyRelease(KeyEvent.VK_5);
			break;
		case 6:
			robo.keyPress(KeyEvent.VK_6);
			robo.keyRelease(KeyEvent.VK_6);
			break;
		case 7:
			robo.keyPress(KeyEvent.VK_7);
			robo.keyRelease(KeyEvent.VK_7);
			break;
		case 8:
			robo.keyPress(KeyEvent.VK_8);
			robo.keyRelease(KeyEvent.VK_8);
			break;
		case 9:
			robo.keyPress(KeyEvent.VK_9);
			robo.keyRelease(KeyEvent.VK_9);
			break;
		}

	}
	
	public void pressAndReleaseEnterKey() {
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void rightClickOnMouse() {
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	}

}
