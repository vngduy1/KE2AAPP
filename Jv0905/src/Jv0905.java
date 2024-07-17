import javax.swing.JFrame;

//ke2a04
//ヴゴックズイ
//2024/07/05


public class Jv0905 extends JFrame {
    public static void main(String[] args) {
        new Jv0905();
    }

    Jv0905() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel());
        setSize(600, 400);
        setVisible(true);
    }
}