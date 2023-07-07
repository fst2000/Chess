import java.awt.EventQueue;

import javax.swing.JFrame;

public class Program
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            System.setProperty("sun.java2d.uiScale", "1.0");
            JFrame frame = new ChessFrame(800, 800, new ChessSceneDrawing());
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
