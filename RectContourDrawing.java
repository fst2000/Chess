import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

class RectContourDrawing implements Drawing
{
    @Override
    public void draw(Graphics2D graphics)
    {
        Stroke s = graphics.getStroke();
        graphics.setStroke(new BasicStroke(0.01f));
        graphics.drawRect(0, 0, 1, 1);
        graphics.setStroke(s);
    }
}