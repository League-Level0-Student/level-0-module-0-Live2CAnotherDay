package _04_amazing_games._1_scary_maze;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class HI_SISTERS_PROJECT extends JPanel {
	BufferedImage maze;

private void showScaryImage(String imageName) {
	try {
		JFrame window = new JFrame();
		window.setVisible(true);
		maze = ImageIO.read(getClass().getResource(imageName));
		JLabel image= new JLabel();
		image.setIcon(new ImageIcon(maze));
		window.add(image);
		window.pack();
	} catch (Exception e) {
		System.err.println("Could not find this image: " + imageName);
	}
	repaint();
}


HI_SISTERS_PROJECT(){
	String name	=JOptionPane.showInputDialog("Hello this is a Bot. What's Your name?");
	JOptionPane.showMessageDialog(null, "Hello, " + name);
	JOptionPane.showMessageDialog(null, "I Hope You don't mind, " + name + ",but I will show you a funny video of a guy in the dark.");

	showScaryImage("Hi_Sisters_pog.gif");
}


	public static void main(String[] args) {
		new HI_SISTERS_PROJECT();
	}
}
