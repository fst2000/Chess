import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

class LocatedDrawing implements Drawing
{
    Drawing source;
    float x;
    float y;

    public LocatedDrawing(float x, float y, Drawing source)
    {
        this.source = source;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D graphics)
    {
        AffineTransform transform = graphics.getTransform();
        graphics.translate(x, y);
        source.draw(graphics);
        graphics.setTransform(transform);
    }   
}