//ke2a04
//ヴゴックズイ
//2024/07/03

import javax.swing.JFrame;

public class Jv0902 extends JFrame {
    public static void main(String[] args) {
        new Jv0902();
    }

    Jv0902() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new GraphicPanel());
        setSize(800, 400);
        setVisible(true);
    }
}
