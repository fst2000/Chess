import java.awt.Graphics;

public class FiguresDrawer implements Drawer
{
    Figure[] figures;
    public FiguresDrawer(Figure... figures) {
        this.figures = figures;
    }

    @Override
    public void draw(Graphics g2d)
    {
        for (Figure figure : figures)
        {
            figure.figureDrawer().draw(g2d);
        }
    }

}
