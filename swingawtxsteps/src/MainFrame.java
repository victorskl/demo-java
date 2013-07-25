//MainFrame.java
import javax.swing.*;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -7737753675059369591L;

	private JPanel p;
	private JCheckBox checkBox1, checkBox2, checkBox3;
	private JLabel label;

	public MainFrame() {
		p = (JPanel) this.getContentPane();
		p.setLayout(null);

		checkBox1 = new JCheckBox("Mathematics");
		checkBox1.setBounds(30, 50, 100, 20);

		checkBox2 = new JCheckBox("History");
		checkBox2.setBounds(30, 80, 90, 20);

		checkBox3 = new JCheckBox("Science");
		checkBox3.setBounds(30, 110, 90, 20);

		label = new JLabel("Select the subjects:");
		label.setBounds(30, 20, 150, 20);

		p.add(checkBox1);
		p.add(checkBox2);
		p.add(checkBox3);
		p.add(label);
	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setTitle("GUI Demo");
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}