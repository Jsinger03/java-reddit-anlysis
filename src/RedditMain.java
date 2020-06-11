import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RedditMain extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JLabel searchlLabel;
	private JButton searchButton;
	private JTextField input;
	private BackEnd on = new BackEnd();

	public RedditMain(String title) {
		super(title);
		this.setLayout(new BorderLayout());
		this.setSize(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		searchlLabel = new JLabel("Enter a word");
		input = new JTextField(10);
		input.setBounds(100, 20, 165, 25);
		mainPanel = new JPanel();
		mainPanel.add(searchlLabel);
		mainPanel.add(input);

		searchButton = new JButton("Search!");
		searchButton.setBounds(10,80,80,25);
		JPanel bottom = new JPanel();
		bottom.add(searchButton);

		this.add(mainPanel, BorderLayout.NORTH);
		this.add(bottom, BorderLayout.SOUTH);
		this.pack();
		setLocationRelativeTo(null);

		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				String key = input.getText();
				String result = on.runner(key);
				Component frame = new JFrame();
				JOptionPane.showMessageDialog(frame, result);
			}
		});
		this.getRootPane().setDefaultButton(searchButton);
	}

	public static void main(String[] args) {
		JFrame frame = new RedditMain("Reddit Gui");
		frame.setVisible(true);
	}

}
