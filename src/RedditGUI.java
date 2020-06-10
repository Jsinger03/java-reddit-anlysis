import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RedditGUI implements ActionListener {
	int count = 0;
	private JLabel label;
	private JPanel panel;
	private JFrame frame;

	public RedditGUI() {
		frame = new JFrame();
		JButton button = new JButton("New button");
		button.addActionListener(this);
		label = new JLabel("Testing again:" + count);
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Reddit Gui");
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new RedditGUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of clicks" + count);
	}
}
