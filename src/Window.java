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
	
	
		
	public static void main(String[] args) {
	
		FirstWindow firstWindow = new FirstWindow();
		
		firstWindow.doLayout();	
	}
}
