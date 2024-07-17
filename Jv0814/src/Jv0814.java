import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//ke2a04
//ヴゴックズイ
//2024/06/26

public class Jv0814  extends JFrame implements AdjustmentListener {
	public static void main(String[] args) {
		new Jv0814();
	}
	
	JScrollBar scrR = new JScrollBar(JScrollBar.HORIZONTAL, 255, 5, 0, 260);
	JScrollBar scrG = new JScrollBar(JScrollBar.HORIZONTAL, 255, 5, 0, 260);
	JScrollBar scrB = new JScrollBar(JScrollBar.HORIZONTAL, 255, 5, 0, 260);
	JLabel lblMix = new JLabel("COLORS!", JLabel.CENTER);
	JLabel lblR = new JLabel("R: ");
	JLabel lblG = new JLabel("G: ");
	JLabel lblB = new JLabel("B: ");
	JLabel lblRv = new JLabel("255");
	JLabel lblGv = new JLabel("255");
	JLabel lblBv = new JLabel("255");
	
	JPanel pnlR = new JPanel(new BorderLayout());
	JPanel pnlG = new JPanel(new BorderLayout());
	JPanel pnlB = new JPanel(new BorderLayout());
	JPanel pnlCtr = new JPanel(new GridLayout(3,1));
	
	Jv0814() {
		scrR.addAdjustmentListener(this);
        scrG.addAdjustmentListener(this);
        scrB.addAdjustmentListener(this);
        
        lblMix.setFont(new Font("Arial", Font.BOLD, 60));

        pnlR.add(lblR, BorderLayout.WEST);
        pnlR.add(scrR, BorderLayout.CENTER);
        pnlR.add(lblRv, BorderLayout.EAST);

        pnlG.add(lblG, BorderLayout.WEST);
        pnlG.add(scrG, BorderLayout.CENTER);
        pnlG.add(lblGv, BorderLayout.EAST);

        pnlB.add(lblB, BorderLayout.WEST);
        pnlB.add(scrB, BorderLayout.CENTER);
        pnlB.add(lblBv, BorderLayout.EAST);

        pnlCtr.add(pnlR);
        pnlCtr.add(pnlG);
        pnlCtr.add(pnlB);

        Container con = getContentPane();   //フレーム表示領域コンテナ
        con.setLayout(new BorderLayout());
        con.add(BorderLayout.CENTER, lblMix);
        con.add(BorderLayout.SOUTH, pnlCtr);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);

        updateBackgroundColor();
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
	    if (e.getSource() == scrR) {
	       lblRv.setText("" + scrR.getValue());
	    } else if (e.getSource() == scrG) {
	       lblGv.setText("" + scrG.getValue());
	    } else if (e.getSource() == scrB) {
	       lblBv.setText("" + scrB.getValue());
	    }
	    updateBackgroundColor();
	}

	void updateBackgroundColor() {
	    int r = scrR.getValue();
	    int g = scrG.getValue();
	    int b = scrB.getValue();
	    Color bgColor = new Color(r, g, b);
	    getContentPane().setBackground(bgColor);
	}
}
