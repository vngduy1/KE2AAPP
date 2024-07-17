import java.awt.*;
import javax.swing.*;

//ke2a04
//ヴゴックズイ
//2024/06/07

public class Jv0808 extends JFrame {
	public static void main(String[] args) {
		new Jv0808();
	}
	
	Jv0808() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();     //ウィンドウズの表示領域コンテナ
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		con.setLayout(new GridLayout(2, 2));
		panel1.setLayout(new GridLayout(2,1));
		panel1.add(new JButton("あ"));
		panel1.add(new JButton("い"));
		con.add(panel1);
		panel2.setLayout(new GridLayout(1,3));
		panel2.add(new JButton("う"));
		panel2.add(new JButton("え"));
		panel2.add(new JButton("お"));
		con.add(panel2);
		con.add(new JButton("か"));
		panel3.setLayout(new GridLayout(2,2));
		panel3.add(new JButton("き"));
		panel3.add(new JButton("く"));
		panel3.add(new JButton("け"));
		panel3.add(new JButton("こ"));
		con.add(panel3);
		setSize(300, 200); 
		setVisible(true);
	}
}
