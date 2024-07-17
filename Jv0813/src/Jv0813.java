import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//ke2a04
//ヴゴックズイ
//2024/06/21

public class Jv0813 extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		new Jv0813();
	}
	
	JComboBox<String> cmbFamily = new JComboBox<String>();
	JComboBox<Integer> cmbSize = new JComboBox<Integer>();
	JButton btnChangeFont = new JButton("Change Now!");
	JLabel lblMain = new JLabel("This is IT!");
	JPanel pnlCtr = new JPanel();
	JPanel pnlTop = new JPanel();
	JPanel pnlBottom = new JPanel();
	
	Jv0813() {
		Container con = getContentPane();   //フレーム表示領域コンテナ
		con.setLayout(new GridLayout(2, 1));
		GraphicsEnvironment ge= GraphicsEnvironment.getLocalGraphicsEnvironment( ); 
		String[ ] strFamNames= ge.getAvailableFontFamilyNames( );
		
		for (String strFamName : strFamNames) {
			cmbFamily.addItem(strFamName);
		}
		for (int i = 1; i <= 40 ; i++) {
			cmbSize.addItem(i);
		}
		cmbSize.setSelectedItem(16);
		
		pnlCtr.setLayout(new FlowLayout());
		pnlCtr.add(cmbFamily);
		pnlCtr.add(cmbSize);
		pnlCtr.add(btnChangeFont);
		con.add(pnlCtr);
		con.add(lblMain);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
		btnChangeFont.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Font fnt = new Font((String) cmbFamily.getSelectedItem(), Font.PLAIN, (int) cmbSize.getSelectedItem());
		
		lblMain.setFont(fnt);
	}
}

