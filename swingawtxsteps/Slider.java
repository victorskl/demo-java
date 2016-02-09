//Slider.java
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider extends JFrame {

	private static final long serialVersionUID = 3693099025169546650L;

	private JPanel p;
	private JTextField textField;
	private JSlider slider;

	public Slider() {
		p = (JPanel) this.getContentPane();
		p.setLayout(new BorderLayout());

		textField = new JTextField("Value : 0");

		slider = new JSlider(0, 100, 1);
		slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textField.setText("Value : " + slider.getValue());
			}
		});

		p.add(slider, BorderLayout.SOUTH);
		p.add(textField, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		Slider s = new Slider();
		s.setTitle("Slider Demo");
		s.setSize(220, 100);
		s.setVisible(true);
		s.setResizable(true);
	}
}