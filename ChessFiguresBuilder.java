import java.awt.Color;

public class ChessFiguresBuilder implements FiguresBuilder {
    int cellSize;
    public ChessFiguresBuilder(int cellSize)
    {
        this.cellSize = cellSize;
    }
    Figure[] chessFigures = new Figure[16];
    @Override
    public Figure[] buildFigures() {
        for(int i = 0; i < 8; i++)
        {
            chessFigures[i] = new Pawn(Color.WHITE, i, 1, cellSize);
        }
        return chessFigures;
    }
    
}
