package bot.model;

import lejos.hardware.lcd.LCD;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class EV3Bot
{
	
	private String botMessage;
	private int xPosition;
	private int yPosition;
	private long waitTime;
	
	private MovePilot botPilot;
	
	
	public EV3Bot()
	{
		this.botMessage = "Billy codes BillyBot";
		this.xPosition = 50;
		this.yPosition = 50;
		this.waitTime = 4000;
		
		setupPilot();
		displayMessage();
		
	}
	
	private void setupPilot()
	{
		
	}
	
	public void driveRoom()
	{
		
	}

	private void displayMessage()
	{
		LCD.drawString(botMessage,  xPosition,  yPosition);
		Delay.msDelay(waitTime);
	}
	
	//
	private void displayMessage(String message)
	{
		LCD.drawString(message,  xPosition,  yPosition);
		Delay.msDelay(waitTime);
	}
	

}
