import java.awt.Color;
import java.awt.Graphics2D;

class ChessFieldDrawing implements Drawing
{
    @Override
    public void draw(Graphics2D graphics)
    {
        graphics.scale(0.125, 0.125);
        graphics.setColor(new Color(125, 66, 32));
        graphics.fillRect(0, 0, 8, 8);
        graphics.setColor(new Color(255, 239, 213));
        
        for(int i = 0; i < 64; i++)
        {
            graphics.fillRect(i % 4 * 2 + (i / 8 & 1), i / 8, 1, 1);
        }

        graphics.scale(8, 8);
    }
}