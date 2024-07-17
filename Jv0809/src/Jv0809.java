//ke2a04
//ヴゴックズイ
//2024/06/12
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Jv0809 extends JFrame implements ActionListener {
	public static void main(String[] args) { 
		new Jv0809();
	}

	Container con = getContentPane();     //ウィンドウズの表示領域コンテナ
	
	JButton button1;
	JButton button2;
	
	Jv0809() {
		button1 = new JButton("ボタン１");
		button1.addActionListener(this);
		con.add(BorderLayout.WEST, button1);
		
		button2 = new JButton("ボタン2");
		button2.addActionListener(this);
		con.add(BorderLayout.EAST, button2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == button1) {
			System.out.println("ボタン１が押されました。");
		} else if(ae.getSource() == button2) {
			System.out.println("ボタン2が押されました。");
		}
	}
	
}
 