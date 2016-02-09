//Frame1.java
import javax.swing.*; //step 1
import java.awt.event.*;

public class Frame1 extends JFrame { //step 2

	private static final long serialVersionUID = -7282618755080444698L;

	private JPanel p; //step 3
	private JButton button; //step 4

	public Frame1() { //step 5
		p = (JPanel) this.getContentPane(); //5.1
		p.setLayout(null); //5.2

		button = new JButton("Click me"); //5.3
		button.setBounds(30, 30, 120, 30); //5.4
		button.addActionListener(new WidgetListener()); //5.5

		p.add(button); //5.6
	}

	public static void main(String[] args) { //step 6
		Frame1 f1 = new Frame1(); // step 7
		f1.setTitle("GUI Demo"); //step 8
		f1.setSize(200, 150);
		f1.setVisible(true);
		f1.setResizable(false);
	}

	private class WidgetListener implements ActionListener { //step 9
		public void actionPerformed(ActionEvent e) { //step 10
			button.setText("Thank you");
		}
	}
}