import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/07/05

public class Jv0904 extends JFrame{
	public static void main(String[] args) {
		new Jv0904();
	}
	
	Jv0904 () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
        setSize(600, 400);
        setVisible(true);
   }
}
