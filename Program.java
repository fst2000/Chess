import javax.swing.JFrame;
import java.awt.Color;

public class Program
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ChessField");
        frame.setBackground(Color.BLACK);
        frame.setSize(500, 500);
        //frame.add();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}