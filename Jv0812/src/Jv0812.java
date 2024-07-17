import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//ke2a04
//ヴゴックズイ
//2024/06/19

public class Jv0812 extends JFrame implements ActionListener {
	
	 JLabel lblTop = new JLabel("JAVA GUI"); //フォントの色。スタイルを変化させる
	 JRadioButton rdoR = new JRadioButton("RED");   //フォント色・赤
	 JRadioButton rdoG = new JRadioButton("GREEN");  //フォント色・緑
	 JRadioButton rdoB = new JRadioButton("BLUE");   //フォント色・青
	 JRadioButton rdoK = new JRadioButton("BLACK");  //フォント色・黒
	 JCheckBox chkB = new JCheckBox("BOLD");    //フォント・太字
	 JCheckBox chkI = new JCheckBox("ITALIC");   //フォント・斜体字
	 //上記rdo/chk設定をlblTopに反映するボタン
	 JButton btnChangeLabelFont = new JButton("ラベルのフォント変更"); 
	 
	 public static void main(String[] args) {
		new Jv0812();
	 }
	 
	 Font fnt = lblTop.getFont();   //lblTopのフォント・既定ー＞サイズアップ
	 Jv0812() {
		 Container con = getContentPane();   //フレーム表示領域コンテナ
		 
		 fnt = new Font("MS 明朝", Font.PLAIN, fnt.getSize()*6);
		 lblTop.setFont(fnt);
         con.add(BorderLayout.NORTH, lblTop);
         JPanel pnlLt = new JPanel();   //rdoを載る左側パネル
         pnlLt.setLayout(new BoxLayout(pnlLt, BoxLayout.Y_AXIS));
         pnlLt.add(rdoR);    
         pnlLt.add(rdoG);
         pnlLt.add(rdoB);
         pnlLt.add(rdoK);
         con.add(BorderLayout.WEST, pnlLt);
         
         JPanel pnlRt = new JPanel();   //chk2つとbtnChangeLabelFontを載せる。
         pnlRt.setLayout(new BoxLayout(pnlRt, BoxLayout.Y_AXIS));
         pnlRt.add(chkB);
         pnlRt.add(chkI);
         pnlRt.add(btnChangeLabelFont);
         con.add(pnlRt);
         
         btnChangeLabelFont.addActionListener(this);        
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(480, 400);
         setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO 自動生成されたメソッド・スタブ
		if(ae.getSource() != btnChangeLabelFont) {
			return;
		}
		
		Color clr;
		if(rdoR.isSelected()) {
			clr = Color.red;
		} else if(rdoG.isSelected()) {
			clr = Color.green;
		} else if(rdoB.isSelected()) {
			clr = Color.blue;
		} else{
			clr = Color.black;
		}
		lblTop.setForeground(clr);
		
		int fstyle = Font.PLAIN;
		if(chkB.isSelected()) {
			fstyle = fstyle | Font.BOLD;
		}
		if(chkI.isSelected()) {
			fstyle = fstyle | Font.ITALIC;
		}
		fnt = new Font(fnt.getFontName(), fstyle, fnt.getSize());
		lblTop.setFont(fnt);
		
	}

}
