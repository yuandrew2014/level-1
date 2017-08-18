import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}
JLabel Labelfori1;
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame f1 = new JFrame();
	private void createBook() {
		// 2. make the frame visible
		f1.setVisible(true);
		// 3. set the size of the frame
		f1.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String i1 = "images.png";
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		
		Labelfori1 = loadImageFromComputer(i1);
		
		// 8. add your JLabel to the frame
		
		f1.add(Labelfori1);
		// 9. call the pack() method on the frame
		f1.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		f1.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked");
		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		f1.remove(Labelfori1);
		// 13. load a new image like before (this is more than one line of code)
		f1.setVisible(true);
		f1.setSize(500, 500);
		String i2 = "download.jpg";
		JLabel Labelfori2;
		Labelfori2 = loadImageFromComputer(i2);
		f1.add(Labelfori2);

		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

