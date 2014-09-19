package main;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Main 
{
	static public final Color N_2 = new Color(234, 222, 210);
	static public final Color N_4 = new Color(233, 218, 188);
	static public final Color N_8 = new Color(238, 162, 102);
	static public final Color N_16 = new Color(240, 129, 81);
	static public final Color N_32 = new Color(241, 101, 77);
	static public final Color N_64 = new Color (241, 70, 46);
	static public final Color N_128 = new Color (232, 198, 95);
	static public final Color N_256 = new Color (232, 195, 79);
	Robot r;
	
	public static void main (String[] args) throws Exception
	{
		Main m = new Main();
		m.run();
		m.play();
		
	}
	
	public Main() throws AWTException
	{
		r = new Robot();
	}
	void run() throws Exception
	{
		open();
	}
	void open() throws Exception
	{
		//Runtime.getRuntime().exec("open https://www.prism.gatech.edu/~hli362/");
		//Runtime.getRuntime().exec("open http://gabrielecirulli.github.io/2048/");
		Runtime.getRuntime().exec("open http://doge2048.com");
	}
	
	public void play() throws InterruptedException
	{
		int i = 0;
		r.setAutoDelay(10);
		Thread.sleep(2000);
		while(i < 100000)
		{
			
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			i++;
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
			i++;
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			i++;
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
			i++;
			
	
		}
	}
}