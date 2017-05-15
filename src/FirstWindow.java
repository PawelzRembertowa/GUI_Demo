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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstWindow extends JFrame implements WindowListener,ActionListener{
	private JLabel label, label1;
	private JFrame frame;
	private JButton button1, button2;
	private JPanel pane, pane1;
	private TextField text, exitText;
	
	
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
		} else {
		
			
			JFrame goodDecision = new JFrame ("Exit");
			goodDecision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			goodDecision.setSize(200, 100);
			goodDecision.setLocation(750, 500);
			goodDecision.setLayout(new FlowLayout());
			pane1 = new JPanel();
			label1 = new JLabel("Dobra decyzja mate");
			JTextField jtf = new JTextField();
			pane1.add(jtf);
			goodDecision.getContentPane().add(pane1);
			goodDecision.setVisible(true);
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
