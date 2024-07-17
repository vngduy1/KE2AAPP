import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
public class Jv1002CL3 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new Jv1002CL3();
	}
	
	JTextArea tA = new JTextArea(5, 20);
	JButton b = new JButton("予報を習得する");
	
	public Jv1002CL3() {
		// TODO 自動生成されたコンストラクター・スタブ
		Container con = getContentPane();
		setTitle("天19532気予報受信クライアント1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scP = new JScrollPane(tA);
		con.add(scP);
		con.add(BorderLayout.SOUTH, b);
		b.addActionListener(this);
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			Socket s = new Socket("127.0.0.1", 5000);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			String weather = reader.readLine();
			reader.close();
			System.out.println("サーバーから受け取った予報：[" +weather +"]\r\n");
		} catch (IOException ae) {
			System.out.println(ae);
		}
	}
}
