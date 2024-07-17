import javax.swing.*;
//ke2a04
//ヴゴックズイ
//2024/07/12

public class Jv0906 extends JFrame {
    public static void main(String[] args) {
        new Jv0906();
    }

    Jv0906() {
        setBounds(400, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel());
        setVisible(true);
    }
}
