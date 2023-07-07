import java.awt.Color;
import java.awt.Graphics2D;

class ColoredDrawing implements Drawing
{
    Color color;
    Drawing source;
    public ColoredDrawing(Color color, Drawing source)
    {
        this.color = color;
        this.source = source;
    }
    @Override
    public void draw(Graphics2D graphics) 
    {
        Color c = graphics.getColor();
        graphics.setColor(color);
        source.draw(graphics);
        graphics.setColor(c);
    }
}