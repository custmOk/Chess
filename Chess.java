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
        addWhitePawns(g);
        addBlackPawns(g);
        addBlackPieces(g);
        addWhitePieces(g);
    }
    public void drawBoard(Graphics g)
    {
        g.setColor(new Color(1, 68, 33));
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

    public void addWhitePawns(Graphics g)
    {
        //region WhitePawns
        Icon whiteAPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteAPawnLabel = new JLabel(whiteAPawn);
        whiteAPawn.paintIcon(this, g, 60, 420);

        Icon whiteBPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteBPawnLabel = new JLabel(whiteBPawn);
        whiteAPawn.paintIcon(this, g, 120, 420);

        Icon whiteCPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteCPawnLabel = new JLabel(whiteCPawn);
        whiteCPawn.paintIcon(this, g, 180, 420);

        Icon whiteDPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteDPawnLabel = new JLabel(whiteDPawn);
        whiteDPawn.paintIcon(this, g, 240, 420);

        Icon whiteEPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteEPawnLabel = new JLabel(whiteEPawn);
        whiteEPawn.paintIcon(this, g, 300, 420);

        Icon whiteFPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteFPawnLabel = new JLabel(whiteFPawn);
        whiteFPawn.paintIcon(this, g, 360, 420);

        Icon whiteGPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteGPawnLabel = new JLabel(whiteGPawn);
        whiteGPawn.paintIcon(this, g, 420, 420);

        Icon whiteHPawn = new ImageIcon("Images/WhitePawn.png");
        JLabel whiteHPawnLabel = new JLabel(whiteHPawn);
        whiteHPawn.paintIcon(this, g, 480, 420);
        //endregion
    }

    public void addBlackPawns(Graphics g)
    {
        Icon blackAPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackAPawnLabel = new JLabel(blackAPawn);
        blackAPawn.paintIcon(this, g, 60, 120);

        Icon blackBPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackBPawnLabel = new JLabel(blackBPawn);
        blackAPawn.paintIcon(this, g, 120, 120);

        Icon blackCPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackCPawnLabel = new JLabel(blackCPawn);
        blackCPawn.paintIcon(this, g, 180, 120);

        Icon blackDPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackDPawnLabel = new JLabel(blackDPawn);
        blackDPawn.paintIcon(this, g, 240, 120);

        Icon blackEPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackEPawnLabel = new JLabel(blackEPawn);
        blackEPawn.paintIcon(this, g, 300, 120);

        Icon blackFPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackFPawnLabel = new JLabel(blackFPawn);
        blackFPawn.paintIcon(this, g, 360, 120);

        Icon blackGPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackGPawnLabel = new JLabel(blackGPawn);
        blackGPawn.paintIcon(this, g, 420, 120);

        Icon blackHPawn = new ImageIcon("Images/BlackPawn.png");
        JLabel blackHPawnLabel = new JLabel(blackHPawn);
        blackHPawn.paintIcon(this, g, 480, 120);
    }

    public void addWhitePieces(Graphics g)
    {
        Icon whiteARook = new ImageIcon("Images/WhiteRook.png");
        JLabel whiteARookLabel = new JLabel(whiteARook);
        whiteARook.paintIcon(this, g, 60, 480);

        Icon whiteHRook = new ImageIcon("Images/WhiteRook.png");
        JLabel whiteHRookLabel = new JLabel(whiteHRook);
        whiteHRook.paintIcon(this, g, 480, 480);

        Icon whiteBKnight = new ImageIcon("Images/WhiteKnight.png");
        JLabel whiteBKnightLabel = new JLabel(whiteBKnight);
        whiteBKnight.paintIcon(this, g, 120, 480);

        Icon whiteGKnight = new ImageIcon("Images/WhiteKnight.png");
        JLabel whiteGKnightLabel = new JLabel(whiteGKnight);
        whiteGKnight.paintIcon(this, g, 420, 480);

        Icon whiteCBishop = new ImageIcon("Images/WhiteBishop.png");
        JLabel whiteCBishopLabel = new JLabel(whiteCBishop);
        whiteCBishop.paintIcon(this, g, 180, 480);

        Icon whiteFBishop = new ImageIcon("Images/WhiteBishop.png");
        JLabel whiteFBishopLabel = new JLabel(whiteFBishop);
        whiteFBishop.paintIcon(this, g, 360, 480);

        Icon whiteDQueen = new ImageIcon("Images/WhiteQueen.png");
        JLabel whiteDQueenLabel = new JLabel(whiteDQueen);
        whiteDQueen.paintIcon(this, g, 240, 480);

        Icon whiteEKing = new ImageIcon("Images/WhiteKing.png");
        JLabel whiteEKingLabel = new JLabel(whiteEKing);
        whiteEKing.paintIcon(this, g, 300, 480);
    }

    public void addBlackPieces(Graphics g)
    {
        Icon blackARook = new ImageIcon("Images/BlackRook.png");
        JLabel blackARookLabel = new JLabel(blackARook);
        blackARook.paintIcon(this, g, 60, 60);

        Icon blackHRook = new ImageIcon("Images/BlackRook.png");
        JLabel blackHRookLabel = new JLabel(blackHRook);
        blackHRook.paintIcon(this, g, 480, 60);

        Icon blackBKnight = new ImageIcon("Images/BlackKnight.png");
        JLabel blackBKnightLabel = new JLabel(blackBKnight);
        blackBKnight.paintIcon(this, g, 120, 60);

        Icon blackGKnight = new ImageIcon("Images/BlackKnight.png");
        JLabel blackGKnightLabel = new JLabel(blackGKnight);
        blackGKnight.paintIcon(this, g, 420, 60);

        Icon blackCBishop = new ImageIcon("Images/BlackBishop.png");
        JLabel blackCBishopLabel = new JLabel(blackCBishop);
        blackCBishop.paintIcon(this, g, 180, 60);

        Icon blackFBishop = new ImageIcon("Images/BlackBishop.png");
        JLabel blackFBishopLabel = new JLabel(blackFBishop);
        blackFBishop.paintIcon(this, g, 360, 60);

        Icon blackDQueen = new ImageIcon("Images/BlackQueen.png");
        JLabel blackDQueenLabel = new JLabel(blackDQueen);
        blackDQueen.paintIcon(this, g, 240, 60);

        Icon blackEKing = new ImageIcon("Images/BlackKing.png");
        JLabel blackEKingLabel = new JLabel(blackEKing);
        blackEKing.paintIcon(this, g, 300, 60);
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
