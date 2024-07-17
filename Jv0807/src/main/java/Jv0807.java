import java.awt.*;
import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/06/07

public class Jv0807 extends JFrame {
	public static void main(String[] args) {
		new Jv0807();
	}
	
	Jv0807() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();     //ウィンドウズの表示領域コンテナ
		con.setLayout(new GridLayout(2, 3));
		con.add(new JButton("１→"));
		con.add(new JButton("2→"));
		con.add(new JButton("3→"));
		con.add(new JButton("4→"));
		con.add(new JButton("5→"));
		con.add(new JButton("6』"));
		setSize(200, 150); 
		setVisible(true);
	}
}
