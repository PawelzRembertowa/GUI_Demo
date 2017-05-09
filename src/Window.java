import javax.swing.*;

public class Window {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JButton button = new JButton("Click me!");
		
		//Zamykanie okna x-em
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Dodajemy nasz przycisk do okna
		frame.getContentPane().add(button);
		
		//Ustawiamy rozmiar okna
		frame.setSize(300, 300);
		
		//Obowiazkowo by okno w ogole sie wyswietlilo
		frame.setVisible(true);
		
	}

}
