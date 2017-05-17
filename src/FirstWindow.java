import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstWindow extends JFrame implements WindowListener,ActionListener{
	private JLabel label, label1;
	private JFrame frame;
	private JButton button1, button2;
	private JPanel pane, pane1;
	private TextField text, exitText;
	//public static FirstWindow firstWindow;
	
	//KONSTRUKTOR
	public FirstWindow(){
	
		super ("Kovi virusing program");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		setResizable(false);
		
		setLocation(750, 500);
		setLayout(new BorderLayout());
		
		pane = new JPanel();
		
		text = new TextField("Czy naprawdê chcesz to zobaczyæ?");
		getContentPane().add(BorderLayout.PAGE_START, text);
		
		button1 = new JButton("Yes, I do");
		getContentPane().add(BorderLayout.LINE_START, button1);
		button1.addActionListener(this);
		//pane.add(button1, BorderLayout.LINE_START);
		
		button2 = new JButton("I don't trust him!");
		getContentPane().add(BorderLayout.LINE_END, button2);
		button2.addActionListener(this);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent buttonClick) {
		if (buttonClick.getSource() == button1){
		SecondWindow secondWindow = new SecondWindow();
		secondWindow.attack();
		this.setVisible(false);
		//firstWindow.dispose();
		} else {
		
			this.setVisible(false);
				
			JOptionPane.showMessageDialog(frame, "That was a good decision", "Exit window", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
