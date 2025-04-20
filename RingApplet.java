import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RingApplet extends Applet implements MouseListener {
    int x, y, radius;

    public void init() {
        addMouseListener(this);
        radius = 0;
    }

    public void paint(Graphics g) {
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        for (radius = 10; radius < 100; radius += 5) {
            repaint();
            try { Thread.sleep(100); } catch (Exception ex) {}
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
