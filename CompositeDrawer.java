import java.awt.Graphics;

public class CompositeDrawer implements Drawer
{
    Drawer[] drawers;
    public CompositeDrawer(Drawer... drawers)
    {
        this.drawers = drawers;
    }
    @Override
    public void draw(Graphics g)
    {
        for (Drawer drawer : drawers)
        {
            drawer.draw(g);
        }
        
    }
        
}
