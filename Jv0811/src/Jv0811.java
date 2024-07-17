//ke2a04
//ヴゴックズイ
//2024/06/12

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Jv0811 extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Jv0811();
    }

    // ボタンの変数を宣言
    JButton btnReset;
    JButton[] btns = new JButton[9];
    boolean turn = true;

    Jv0811() {
        Container con = getContentPane();   //ウィンドウズの表示領域コンテナ
        con.setLayout(new BorderLayout());
        
        btnReset = new JButton("RESET");
        btnReset.addActionListener(this);
        con.add(btnReset, BorderLayout.NORTH);
        
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));
        
        for(int i = 0; i < 9; i++) {
        	btns[i] = new JButton("");
        	btns[i].setFont(new Font("Arial", Font.PLAIN, 40));
        	btns[i].addActionListener(this);
        	gridPanel.add(btns[i]);
        }
        
        con.add(gridPanel, BorderLayout.CENTER);
        
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == btnReset) {
    		resetGame();
    	} else {
    		for(int i = 0; i < 9; i++) {	
    			if(e.getSource() == btns[i] && btns[i].getText().equals("")) {
        			if(turn) {
        				btns[i].setText("O");
        			} else {
        				btns[i].setText("X");
        			}
        			turn = !turn;
        			checkWinner();
        		}
    		}
    		
    	}
    }
    
    private void resetGame() {
    	for(int i = 0; i < 9; i++) {
    		btns[i].setText("");
    		btns[i].setEnabled(true);
    	}
    	btnReset.setText("RESET");
    	turn = true;
    }
    
    private void checkWinner() {
    	String[][] patterns = {
    		{"O", "O", "O"},
    		{"X", "X", "X"},
    	};
    	
    	int[][] winPatterns = {
    			{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
    			{0, 3, 6}, {1, 4, 7}, {2, 5, 8},
    			{0, 4, 8}, {2, 4, 6}
    	};
    	
    	for(String[] patern: patterns) {
    		for(int[] winPattern : winPatterns) {
    			if(btns[winPattern[0]].getText().equals(patern[0]) &&
    				btns[winPattern[1]].getText().equals(patern[1]) &&
    				btns[winPattern[2]].getText().equals(patern[2])) {
					gameOver(patern[0]);
					System.out.println(winPattern);
    				return;
    			}
    		}
    	}
    }
    
    private void gameOver(String winner) {
    	if(winner.equals("O")) {
    		btnReset.setText("You gotta win!");
    	} else {
    		btnReset.setText("You gotta lose!");
    	}
    	
    	for (int i = 0; i < 9; i++) {
    		btns[i].setEnabled(false);
    	}
    }
}
