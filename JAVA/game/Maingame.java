package game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Maingame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame obj = new JFrame();
		
		obj.setSize(500, 500);
		
		obj.setTitle("Breaker");
		
		obj.setResizable(false);
		
		obj.setVisible(true);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon image = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.JPG");
		
		obj.setIconImage(image.getImage());
		
		obj.getContentPane().setBackground(new Color(0,0,0));

	}

}
