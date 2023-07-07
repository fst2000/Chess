import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

class ScaledDrawing implements Drawing
{
    Drawing source;
    Float2 scale;
    public ScaledDrawing(Float2 scale, Drawing source)
    {
        this.source = source;
        this.scale = scale;
    }
    @Override
    public void draw(Graphics2D graphics)
    {
        AffineTransform transform = graphics.getTransform();
        scale.accept(graphics::scale);
        source.draw(graphics);
        graphics.setTransform(transform);
    }
}