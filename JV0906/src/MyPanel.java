import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements MouseMotionListener, MouseListener {
    private int lastX = -1;
    private int lastY = -1;
    private int centerX = 400;
    private int centerY = 300;

    public MyPanel() {
        addMouseMotionListener(this);
        addMouseListener(this);
        setBackground(Color.white);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(centerX, 0, centerX, getHeight());
        g.drawLine(0, centerY, getWidth(), centerY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(10, 10, 100, 20);
        g.setColor(Color.BLACK);
        int x = e.getX() - centerX;
        int y = centerY - e.getY();
        g.drawString(String.format("(%d, %d)", x, y), 10, 25);
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        int x = e.getX();
        int y = e.getY();
        int transformedX = x - centerX;
        int transformedY = centerY - y;
        
        if (lastX != -1 && lastY != -1) {
            g.setColor(Color.RED);
            g.drawLine(lastX, lastY, x, y);
            g.drawString(String.format("(%d, %d)", transformedX, transformedY), x, y);
        }
        
        lastX = x;
        lastY = y;
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
