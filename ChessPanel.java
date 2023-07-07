import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

class ChessPanel extends JPanel
{
    Float2 size;
    Drawing drawing;

    public ChessPanel(Float2 size, Drawing drawing)
    {
        this.size = size;
        this.drawing = new ScaledDrawing(size, drawing);
    }

    @Override
    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth(), getHeight());
        drawing.draw((Graphics2D)g);
        repaint();
    }
}