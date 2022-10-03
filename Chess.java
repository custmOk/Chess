import javax.swing.*;
import java.awt.*;

public class Chess extends Canvas
{
    public static void main(String[] args)
    {
        final int HEIGHT = 1000, WIDTH = 1000;
        JFrame frame = new JFrame("Chess Board");
        Canvas canvas = new Chess();
        canvas.setSize(HEIGHT, WIDTH);
        frame.add(canvas);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paint (Graphics g)
    {
        drawBoard(g);
        addNotation(g);
    }
    public void drawBoard(Graphics g)
    {
        int count = 1;
        for (int i = 100; i <= 800; i += 200)
        {
            for (int j = 100; j <= 800; j += 100)
            {
                if (count % 2 == 0)
                    g.fillRect(i, j, 100, 100);
                else
                    g.fillRect(i + 100, j, 100, 100);
                count++;
            }
        }
        g.setColor(Color.RED);
        g.fillRect(75, 75, 850, 25);
        g.fillRect(75, 900, 850, 25);
        g.fillRect(900, 75, 25, 850);
        g.fillRect(75, 75, 25, 850);
    }

    public void addNotation(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact", Font.PLAIN, 30));
        String letters = "ABCDEFGH";
        String numbers = "87654321";
        int index = 0;
        for (int i = 145; i <= 845; i += 100)
        {
            g.drawString(letters.substring(index, index + 1), i, 65);
            index++;
        }
        index = 0;
        for (int i = 145; i <= 845; i += 100)
        {
            g.drawString(letters.substring(index, index + 1), i, 965);
            index++;
        }
        index = 0;
        for (int i = 155; i <= 855; i += 100)
        {
            g.drawString(numbers.substring(index, index + 1), 50, i);
            index++;
        }
        index = 0;
        for (int i = 155; i <= 855; i += 100)
        {
            g.drawString(numbers.substring(index, index + 1), 935, i);
            index++;
        }
    }
}
