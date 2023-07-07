import java.awt.Graphics2D;

class CircleDrawing implements Drawing
{
    @Override
    public void draw(Graphics2D graphics)
    {
        graphics.fillOval(0, 0, 1, 1);
    }
}