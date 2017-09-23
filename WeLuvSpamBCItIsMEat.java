import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class WeLuvSpamBCItIsMEat {
	static final String FAKE_USERNAME = "asainchickenproductions2@gmail.com";
	static final String FAKE_PASSWORD = "abcdefghijklmnop";
public static void main(String[] args) {
	WeLuvSpamBCItIsMEat s1 = new WeLuvSpamBCItIsMEat();
	s1.v1();
	}
void v1() {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JTextField t1 = new JTextField(20);
	JButton b1= new JButton();
	JButton b2 = new JButton();
	f1.setVisible(true);
	p1.setVisible(true);
	t1.setVisible(true);
	b1.setVisible(true);
	b2.setVisible(true);
f1.add(p1);
p1.add(t1);
p1.add(b1);
p1.add(b2);
f1.pack();
}
}
