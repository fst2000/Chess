import javax.swing.JFrame;
import javax.swing.JPanel;

class ChessFrame extends JFrame
{
    int width;
    int height;
    JPanel panel;

    ChessFrame(int width, int height, Drawing drawing)
    {
        this.width = width;
        this.height = height;
        panel = new ChessPanel(a ->
        {
            a.call(this.getWidth() - 50, this.getHeight() - 50);
        }, drawing);
        add(panel);
        setSize(width, height);
    }
}