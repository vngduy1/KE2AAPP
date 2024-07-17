import javax.swing.JFrame;

//ke2a04
//ヴゴックズイ
//2024/07/05

public class Jv0903 extends JFrame{
    public static void main(String[] args) {
    	new Jv0903();
    }
    
    Jv0903 () {
    	 add(new FontPanel());
         setSize(400, 300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }
}