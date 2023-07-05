import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class JFrameDisplayer implements Displayer
{
    class DisplayerJPanel extends JPanel
    {
        Drawer d;
        public DisplayerJPanel(Drawer d)
        {
            this.d = d;
        }
        @Override
        protected void paintComponent(Graphics g)
        {
            d.draw(g);
        }
        
    }
    JFrame frame;
    int width;
    int height;
    public JFrameDisplayer(JFrame frame, int width, int height) {
        this.frame = frame;
        frame.setBackground(Color.BLACK);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void display(Drawer drawer)
    {
        frame.add(new DisplayerJPanel(drawer));
        frame.repaint();
    }
}
