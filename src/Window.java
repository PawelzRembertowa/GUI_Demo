import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import sun.audio.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

public class Window extends JFrame  {
	
	private ImageIcon image;
	private JLabel label;
	private boolean loop = true;
	private Icon icon;
	
	Window(){
		setLayout(new FlowLayout());
		icon = new ImageIcon("laughingKovi.gif");
		image = new ImageIcon(getClass().getResource("kovi.gif"));
		label = new JLabel (icon);
		add(label);
	}
		
	public static void main(String[] args) {
	
		FirstWindow firstWindow = new FirstWindow();
		
		firstWindow.doLayout();
		//Deprecated
		//firstWindow.show();
		
//		
//		File laugh = new File("laughingpart.wav");
//		
//
//			
//		for (int i=0; i<25; i++){
//		playSound(laugh);	
//		Window frame = new Window();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Kovi Virus U");
//		Random r = new Random();
//		int y = r.nextInt(950);
//		int x = r.nextInt(1550);
//		frame.setLocation(x, y);
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		frame.pack();
//		frame.setVisible(true);
//		
//		}
//	}
//		
//
//	public static synchronized void playSound(File Sound){
//		new Thread(new Runnable(){
//			public void run(){
//		
//		try {
//			Clip clip = AudioSystem.getClip();
//			AudioInputStream inputStream = AudioSystem.getAudioInputStream(Sound);
//			clip.open(inputStream);
//			clip.start();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//	}
//		}).start();
}
}
