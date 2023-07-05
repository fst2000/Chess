import javax.swing.JFrame;
public class Program
{
    public static void main(String[] args)
    {
        int size = 400;
        Displayer jFrame = new JFrameDisplayer(new JFrame("ChessField"), size, size);
        Drawer figuresDrawer = new FiguresDrawer(new ChessFiguresBuilder(size >> 3).buildFigures());
        jFrame.display(figuresDrawer);
    }
}