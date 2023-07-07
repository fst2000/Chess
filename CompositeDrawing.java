import java.awt.Graphics2D;

class CompositeDrawing implements Drawing
{
    Drawing[] drawings;
    public CompositeDrawing(Drawing... drawings)
    {
        this.drawings = drawings;
    }
    @Override
    public void draw(Graphics2D graphics)
    {
        for(Drawing d : drawings) d.draw(graphics);
    }
}