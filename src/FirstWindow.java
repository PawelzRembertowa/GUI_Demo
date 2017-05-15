import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstWindow extends JFrame{
	private JLabel label;
	private JFrame frame;
	private JButton button1, button2;
	private JPanel pane;
	public FirstWindow(){
		
		super ("Kovi virusing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		setResizable(false);
		//pack();
		setLocation(750, 500);
		setLayout(new BorderLayout());
		
		pane = new JPanel();
		
		button1 = new JButton("Yes, I do");
		getContentPane().add(BorderLayout.LINE_START, button1);
		//pane.add(button1, BorderLayout.LINE_START);
		
		button2 = new JButton("I don't trust him!");
		getContentPane().add(BorderLayout.LINE_END, button2);
		//pane.add(button2, BorderLayout.LINE_END);
		
		setVisible(true);
	}
}
