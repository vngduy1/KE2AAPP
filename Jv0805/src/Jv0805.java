import java.awt.*;
import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/06/07

public class Jv0805 extends JFrame {
	public static void main(String[] args) {
		new Jv0805();
	}
	
	Jv0805() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();     //ウィンドウズの表示領域コンテナ
		con.setLayout(new FlowLayout());
		con.add(new JButton("1 January"));
		con.add(new JButton("2 February"));
		con.add(new JButton("3 March"));
		con.add(new JButton("4 April"));
		con.add(new JButton("5 May"));
		con.add(new JButton("6 June"));
		setSize(300, 200); 
		setVisible(true);
	}
}
