import java.awt.Color;
import java.awt.Graphics2D;

class ChessSceneDrawing implements Drawing
{
    Drawing drawing;

    public ChessSceneDrawing()
    {
        Drawing[] pawns = new Drawing[16];
        Color primaryWhite = new Color(179, 150, 107);
        Color secondaryWhite = new Color(250, 215, 161);
        Color primaryBlack = new Color(87, 58, 24);
        Color secondaryBlack = new Color(168, 90, 45);

        Drawing whitePawn = new PawnDrawing(primaryWhite, secondaryWhite);
        Drawing blackPawn = new PawnDrawing(primaryBlack, secondaryBlack);

        for(int i = 0; i < 8; i++)
        {
            pawns[i] = new LocatedDrawing(i, 1, whitePawn);
            pawns[i + 8] = new LocatedDrawing(i, 6, blackPawn);
        }

        Float time = new Time();

        drawing = new LocatedDrawing(0.5f, 0.5f, 
            new RotatedDrawing(time, new LocatedDrawing(-0.25f, -0.25f,
                new ScaledDrawing(new StructScale(0.5f, 0.5f), new CompositeDrawing(
                    new ChessFieldDrawing(),
                    new ScaledDrawing(new StructScale(0.125f, 0.125f), new CompositeDrawing(pawns)),
                    new ColoredDrawing(Color.black, new RectContourDrawing()))))));
    }

    @Override
    public void draw(Graphics2D graphics)
    {
        drawing.draw(graphics);
    }
}