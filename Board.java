import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.*;
/**
 * create a two colors of squares chessboard.
 * 
 * @author Glorio Yulianto
 * @version 1.1 30 Oct 2013
 */
public class Board
{
    
    // instance variables - replace the example below with your own
    private int size = 8;
    private Color colorOne, colorTwo;
    private int sizeOfSquare = 8;
    private int x, y;
    private JPanel[][] pnlChessCells = new JPanel[sizeOfSquare][sizeOfSquare];
    /**
     * Constructor for objects of class Board
     */
    public Board(Color one, Color two)
    {
        colorOne = one;
        colorTwo = two;
        
    }

    public void draw (Graphics2D G, int x, int y, int sizeInPixel)
    {
        G.setColor(colorOne);
        G.drawRect(x, y, sizeInPixel, sizeInPixel);
        G.fillRect(x,y,sizeInPixel,sizeInPixel);
        this.x = x;
        this.y = y;
   
    }
    
    public Color getColorOne ()
    {
        return colorOne;
    }
 

    public Color getColorTwo ()
    {
        return colorTwo;
    }
    
    public int getSize()
    {
        return sizeOfSquare;
    }
    
}
