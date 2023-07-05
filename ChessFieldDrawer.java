import java.awt.Color;
import java.awt.Graphics;

public class ChessFieldDrawer implements Drawer
{
    int size;
    public ChessFieldDrawer(int size)
    {
        this.size = size;
    }
    @Override
    public void draw(Graphics g)
    {
        int cellSize = size >> 3;
        for(int y = 0; y < 8; y++)
        {
            for(int x = 0; x < 8; x++)
            {
                if((x + y) % 2 == 0) g.setColor(Color.LIGHT_GRAY);
                else g.setColor(Color.DARK_GRAY);
                g.fillRect(x * cellSize, y * cellSize , cellSize, cellSize);
            }
        }    
    }
    
}
