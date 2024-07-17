import java.awt.*;
import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/06/07

public class Jv0804 extends JFrame {
	public static void main(String[] args) {
		new Jv0804();
	}
	
	Jv0804() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();  //ウィンドウズの表示領域コンテナ
		con.add(BorderLayout.CENTER, new JButton("CENTER"));
		con.add(BorderLayout.SOUTH, new JButton("SOUTH"));
		con.add(BorderLayout.WEST, new JButton("WEST"));
		con.add(BorderLayout.EAST, new JButton("EAST"));
		con.add(BorderLayout.NORTH, new JButton("NORTH"));
		setSize(300, 200); 
		setVisible(true);
	}
}
