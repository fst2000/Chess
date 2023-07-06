import javax.swing.JFrame;
public class Program
{
    public static void main(String[] args)
    {
        int size = 400;
        Displayer jFrame = new JFrameDisplayer(new JFrame("ChessField"), size, size);
        Figure figures = new CompositeFigure(new ChessFiguresBuilder(size >> 3).buildFigures());
        Drawer chessFieldDrawer = new ChessFieldDrawer(size);
        jFrame.display(chessFieldDrawer);
        jFrame.display(figures.figureDrawer());
    }
}