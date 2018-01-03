package app;

import javax.swing.JFrame;

public class Hello extends JFrame {

	public Hello() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);
	}

	public static void main(String... args) {
		new Hello();

	}

}
