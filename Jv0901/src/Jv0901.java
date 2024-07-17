import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/06/28

public class Jv0901 extends JFrame {
	public static void main(String[] args) {
		new Jv0901();
	}
	
	Jv0901 () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(600, 600);
		setVisible(true);
	}
}
