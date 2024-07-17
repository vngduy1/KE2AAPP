//ke2a04
//ヴゴックズイ
//2024/06/28

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public void paintComponent (Graphics g) {
		int N = 20;
		int r = 200;
		int[] arrayX = new int[N];
		int[] arrayY = new int[N];
		
		for (int i = 0; i < N; i++) {
			arrayX[i] = (int)(250 + r * Math.cos(2 * Math.PI * i / N));
			arrayY[i] = (int)(250 + r * Math.sin(2 * Math.PI * i / N));
		}
		
		for (int i = 0; i < N; i++) {
			for(int j =i + 1; j < N; j++) {
				g.drawLine(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
			}
		}
	}
}
