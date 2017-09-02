import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Garbageframe {
	
public static void main(String[] args) {
	Garbageframe ha = new Garbageframe();
	ha.ButtonFace();
}
void ButtonFace() {
	JFrame f1 = new JFrame();
	
	JPanel p1 = new JPanel();
	JButton b1 = new JButton();
	p1.setVisible(true);
	f1.setVisible(true);
	b1.setVisible(true);
	f1.add(p1);
	JTextField t2 = new JTextField(20);
	p1.add(t2);
	p1.add(b1);
	JTextField t1 = new JTextField(20);	
	p1.add(t1);
	b1.setText("convert");

	f1.pack();
	
	
}
String convert(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	}
	 if(!Pattern.matches("\2", binary)) {
		 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	 }
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter= (char)asciiValue;
		return ""+ theLetter;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	}
	return "";
}


}
