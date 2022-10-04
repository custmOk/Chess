import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Chess extends Canvas implements MouseListener
{
    public static void main(String[] args)
    {
        final int HEIGHT = 600, WIDTH = 600;
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
        addImages(g);
    }
    public void drawBoard(Graphics g)
    {
        int count = 1;
        for (int i = 60; i <= 480; i += 120)
        {
            for (int j = 60; j <= 480; j += 60)
            {
                if (count % 2 == 0)
                    g.fillRect(i, j, 60, 60);
                else
                    g.fillRect(i + 60, j, 60, 60);
                count++;
            }
        }
        g.setColor(Color.RED);
        g.fillRect(45, 45, 510, 15);
        g.fillRect(45, 540, 510, 15);
        g.fillRect(540, 45, 15, 510);
        g.fillRect(45, 45, 15, 510);
    }

    public void addNotation(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact", Font.PLAIN, 15));
        String letters = "ABCDEFGH";
        String numbers = "87654321";
        int index = 0;
        for (int i = 85; i <= 510; i += 60)
        {
            g.drawString(letters.substring(index, index + 1), i, 40);
            index++;
        }
        index = 0;
        for (int i = 85; i <= 510; i += 60)
        {
            g.drawString(letters.substring(index, index + 1), i, 570);
            index++;
        }
        index = 0;
        for (int i = 90; i <= 510; i += 60)
        {
            g.drawString(numbers.substring(index, index + 1), 30, i);
            index++;
        }
        index = 0;
        for (int i = 90; i <= 510; i += 60)
        {
            g.drawString(numbers.substring(index, index + 1), 560, i);
            index++;
        }
    }

    public void addImages(Graphics g)
    {
        Icon whiteAPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteAPawnLabel = new JLabel(whiteAPawn);
        whiteAPawn.paintIcon(this, g, 60, 60);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
