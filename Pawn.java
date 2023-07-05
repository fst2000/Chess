import java.awt.Color;
public class Pawn implements Figure
{
    Color c;
    int posX;
    int posY;
    int cellSize;
    public Pawn(Color c, int posX, int posY, int cellSize) {
        this.c = c;
        this.posX = posX;
        this.posY = posY;
        this.cellSize = cellSize;
    }
    @Override
    public Drawer figureDrawer()
    {
        int figureSize = cellSize >> 1;
        int offset = figureSize >> 1;
        return g2d ->
        {
            g2d.setColor(c);
            g2d.fillOval((posX * cellSize) + offset, (posY * cellSize) + offset, figureSize, figureSize);
        };
    }
}
