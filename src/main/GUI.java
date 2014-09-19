package main;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class GUI extends JFrame
{
	Color c;
	static Robot r;
	static GUI g;
	static int lineWidth = 0;
	static int squareWidth = 0;
	
	static public void main(String[] argwefa) throws Exception
	{
		r = new Robot();
		g = new GUI();
		g.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
		g.setVisible(true);
//		Thread.sleep(5000);
		BufferedImage img = r.createScreenCapture(new Rectangle(0,0,Toolkit.getDefaultToolkit().getScreenSize().width,
				Toolkit.getDefaultToolkit().getScreenSize().height));
		int y = 330; 
		int x = 330; 
		Point begin = new Point();
		Toolkit.getDefaultToolkit().beep();
		int color = img.getRGB (x,y);
//		System.out.println("alpha: " + (color & 0xFF000000) / 0x1000000 + "; red: " + (color & 0xFF0000) / 0x10000 + "; green: " + (color & 0xFF00) / 0x100 + "; blue: " + (color & 0xFF));
		Color edgeColor = new Color(173,157,143);
		int edgeCol = edgeColor.getRGB();
		Color squareColor = new Color(194,180,165);
		int squareCol = edgeColor.getRGB();
		
		for (; img.getRGB (x, y) != squareCol; x++){};
		for (; img.getRGB (x, y) != edgeCol; y++){}
		
		
		
//		for (; y < img.getHeight() && img.getRGB (x, y) != edgeCol; y+=105 )
//		{
//			//while (img.getRGB(x, y))
//		}
//		
//		//the 15 pixel length color: (rgb):173/157/143 
//		//the 106 pixel length color: (rgb):194/180/165
//		
//		for (; color == img.getRGB (x,y); x++);
//		
//		color = img.getRGB(x, y);
//		for (; color == img.getRGB (x,y); x++)
//		{
//			lineWidth++; 
//		}
//		color = img.getRGB(x, y);
//		for (; color == img.getRGB (x,y); x++)
//		{
//			squareWidth++; 
//		}
		
		System.out.println ("lineWidth: " + lineWidth + " squareWidth: " + squareWidth);
				while (true)
			g.repaint();
	}
	GUI()
	{
		setSize(400, 400);
	}
	public void paint(Graphics g)
	{
		Point p = MouseInfo.getPointerInfo().getLocation();
		c = r.getPixelColor(p.x, p.y);
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.black);
		g.drawString(c.toString(), 50, 50);
		g.drawString(p.x + ", " + p.y, 50, 100);
	}
}
