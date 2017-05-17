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

public class SecondWindow extends JFrame {
	private ImageIcon image;
	private JLabel label;
	private boolean loop = true;
	private Icon icon;
	
	SecondWindow(){
		
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Kovi Virus U");
		Random r = new Random();
		int y = r.nextInt(950);
		int x = r.nextInt(1550);
		setLocation(x, y);
		setLayout(new FlowLayout());
		try {
		icon = new ImageIcon("kovi.gif");
		label = new JLabel (icon);
		label.setIcon(icon);
		getContentPane().add(label, java.awt.BorderLayout.CENTER);
		}catch (Exception exception) {
            exception.printStackTrace();
        }
		
		//getContentPane().add(label);
		setSize(300, 300);
		//pack();
		setVisible(true);
	
		
	}

	public void attack() {
		File laugh = new File("laughingpart.wav");
		playSound(laugh);
//		for (int i=0; i<25; i++){
//			try {
//				Thread.sleep(750);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//				new SecondWindow();
//		}
	}

	public static synchronized void playSound(File Sound){
		new Thread(new Runnable(){
			public void run(){
		
		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(Sound);
			clip.open(inputStream);
			clip.start();
			clip.loop(100);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		}).start();
	}
}
