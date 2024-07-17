import javax.swing.*;
import java.awt.*;

class FontPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;

        String title = "ECC Computer";
        String subTitle = "Dialog";
        String repeatingText = "IT College";
        
        Dimension dim = getSize();
        int panelWidth = dim.width;
        int panelHeight = dim.height;

        Font titleFont = new Font("Serif", Font.BOLD, 36);
        g2d.setFont(titleFont);
        g2d.setColor(Color.CYAN);
        int titleX = 10; 
        int titleY = panelHeight / 6;
        g2d.drawString(title, titleX, titleY);

        int lineY = titleY + 5;
        g2d.drawLine(0, lineY, panelWidth, lineY);

        Font subTitleFont = new Font("SansSerif", Font.PLAIN, 16); 
        g2d.setFont(subTitleFont);
        g2d.setColor(Color.BLACK);
        int subTitleY = lineY + panelHeight / 6;
        g2d.drawString(subTitle, 10, subTitleY);

        Font repeatingFont = new Font("Monospaced", Font.PLAIN, 20);
        g2d.setFont(repeatingFont);
        g2d.setColor(Color.BLUE); 
        int repeatingY = panelHeight / 2;
        int repeatingX = 10; 
        int stepX = g2d.getFontMetrics().charWidth('I');
        int stepY = g2d.getFontMetrics().getHeight() / 2;

        while (repeatingY < panelHeight) {
            g2d.drawString(repeatingText, repeatingX, repeatingY);
            repeatingY += stepY;
            repeatingX += stepX;
            if (repeatingX + g2d.getFontMetrics().stringWidth(repeatingText) > panelWidth) {
                repeatingX = 10;
            }
        }
    }
}