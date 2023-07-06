public class CompositeFigure implements Figure
{

    Figure[] figures;
    public CompositeFigure(Figure[] figures)
    {
        this.figures = figures;
    }
    @Override
    public Drawer figureDrawer()
    {
        Drawer[] drawers = new Drawer[figures.length];
        for(int i = 0; i < drawers.length; i++)
        {
            drawers[i] = figures[i].figureDrawer();
        }
        return new CompositeDrawer(drawers);
    }
        
}
