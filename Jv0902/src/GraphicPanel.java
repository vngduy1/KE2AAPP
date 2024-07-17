import java.awt.*;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawArc(g);
        FillOval(g);
        FillRect(g);
        FillPolygon(g);
        DrawLine(g);
    }

    private void DrawArc(Graphics g) {
        Color[] c = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
            Color.BLUE, Color.PINK
        };
        Dimension dim = getSize();
        int w = dim.width * 2/3;
        int h = dim.height;

        for (int i = 0; i < c.length; i++) {
            g.setColor(c[i]);
            g.drawArc(-20, 0 + i * 10, w, h, 0, 135);
        }
    }

    private void FillOval(Graphics g) {
        Dimension dim = getSize();
        int radius = dim.width / 6;
        int x = dim.width * 3 / 4 - radius;
        int y = dim.height * 3 / 4 - radius;
        
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }

    private void FillRect(Graphics g) {
        Dimension dim = getSize();
        int radius = dim.width / 6;
        int side = radius / 5;
        int x = dim.width * 3 / 4 - side / 2;
        int y = dim.height * 3 / 4 - radius - side;
        
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, side, side);
    }

    private void FillPolygon(Graphics g) {
        Dimension dim = getSize();
        int radius = dim.width / 6;
        int side = radius / 5;
        int x = dim.width * 3 / 4 - side / 2;
        int y = dim.height * 3 / 4 - radius - side * 2;
        
        g.setColor(Color.GREEN);
        Polygon triangle = new Polygon();
        triangle.addPoint(x, y + side);
        triangle.addPoint(x + side / 2, y);
        triangle.addPoint(x + side, y + side);
        g.fillPolygon(triangle);
    }

    private void DrawLine(Graphics g) {
        Dimension dim = getSize();
        int x1 = 0;
        int y1 = dim.height;
        int x2 = dim.width;
        int y2 = 0;
        
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
    }
}
