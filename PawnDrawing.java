import java.awt.Color;
import java.awt.Graphics2D;

class PawnDrawing implements Drawing
{
    Drawing drawing;

    public PawnDrawing(Color primary, Color secondary)
    {
        drawing = new CompositeDrawing(new ColoredDrawing(primary,
            new CompositeDrawing(
                new CircleDrawing(),
                new ColoredDrawing(
                    secondary,
                    new LocatedDrawing(0.25f, 0.25f, new ScaledDrawing(new StructScale(0.5f,0.5f), new CircleDrawing()))))),
            new ColoredDrawing(Color.black, new CircleContourDrawing()));
    }

    @Override
    public void draw(Graphics2D graphics)
    {
        drawing.draw(graphics);
    }
}