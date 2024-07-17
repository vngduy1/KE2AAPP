//ke2a04
//ヴゴックズイ
//2024/06/12

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Jv0810 extends JFrame implements ActionListener {
    // ボタンの変数を宣言
    JButton btnM, btnN, btnE, btnGrt;

    public static void main(String[] args) {
        new Jv0810();
    }

    Jv0810() {

        // コンテナを取得
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        // 左側のパネルを作成して3つのボタンを追加
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1));
        btnM = new JButton("朝");
        btnN = new JButton("昼");
        btnE = new JButton("晩");
        
        // 左側のボタンにアクションリスナーを追加
        btnM.addActionListener(this);
        btnN.addActionListener(this);
        btnE.addActionListener(this);

        leftPanel.add(btnM);
        leftPanel.add(btnN);
        leftPanel.add(btnE);
        
        btnGrt = new JButton("Greeting!");

        // 左側と右側のパネルをコンテナに追加
        con.add(leftPanel, BorderLayout.WEST);
        con.add(btnGrt, BorderLayout.CENTER);
        
        Font fnt = btnGrt.getFont();
        //フォントの拡大倍率 
        fnt = new Font(fnt.getFontName(), fnt.getStyle(), fnt.getSize() * 2);
        btnGrt.setFont(fnt);
        btnM.setFont(fnt);
        btnN.setFont(fnt);
        btnE.setFont(fnt);

        // フレームを表示
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ボタンがクリックされた時の処理
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnM) {
            btnGrt.setText("おはよう！");
        } else if (e.getSource() == btnN) {
            btnGrt.setText("こんにちは");
        } else if (e.getSource() == btnE) {
            btnGrt.setText("こんばんは");
        }
    }
}
