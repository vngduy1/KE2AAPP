import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements MouseMotionListener {
    public MyPanel() {
        addMouseListener(new MyMouseHandler(this));
        addMouseMotionListener(this);
        setBackground(Color.white);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX() - 2, e.getY() - 2, 5, 5);
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
}

class MyMouseHandler extends MouseAdapter {
    private MyPanel mp;

    public MyMouseHandler(MyPanel p) {
        this.mp = p;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = mp.getGraphics();
        g.setColor(new Color(
            (int) (Math.random() * 256),
            (int) (Math.random() * 256),
            (int) (Math.random() * 256)));
        g.fillRect(e.getX() - 5, e.getY() - 5, 10, 10);
    }
}