import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

//ke2a04
//ヴゴックズイ
//2024/06/26

public class Jv0815 extends JFrame implements ActionListener, DocumentListener {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Jv0815();
	}
	
	JTextField txtL = new JTextField(10); 
    JTextField txtR = new JTextField(10); 
    JLabel lblPlus = new JLabel("+");     
    JButton btnEq = new JButton("=");     
    JLabel lblRes = new JLabel("");  
	
	Jv0815 () {
		Container con = getContentPane();   //フレーム表示領域コンテナ
		con.setLayout(new FlowLayout());
		con.add(txtL);
		con.add(lblPlus);
		con.add(txtR);
		con.add(btnEq);
		con.add(lblRes);
		txtL.getDocument().addDocumentListener(this);
		txtR.getDocument().addDocumentListener(this);
		btnEq.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 100);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEq) {
			int numL = Integer.parseInt(txtL.getText());
			int numR = Integer.parseInt(txtR.getText());
			int sum = numL + numR;
			lblRes.setText(String.valueOf(sum));
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		clearResult();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		clearResult();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		clearResult();
	}
	
	public void clearResult() {
		lblRes.setText("");
	}

}
