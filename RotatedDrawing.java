import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

class RotatedDrawing implements Drawing
{
    Float angle;
    Drawing source;

    public RotatedDrawing(Float angle, Drawing source)
    {
        this.angle = angle;
        this.source = source;
    }

    @Override
    public void draw(Graphics2D graphics)
    {
        AffineTransform t = graphics.getTransform();
        angle.accept(graphics::rotate);
        source.draw(graphics);
        graphics.setTransform(t);
    }
}