import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.*;
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
    private JPanel pnlMain = new JPanel(new GridLayout(8,8));

    /**
     * Constructor for objects of class Board
     */
    public Board(Color one, Color two)
    {
        colorOne = one;
        colorTwo = two;
        
    }

    public void draw (Graphics2D G, int j, int k, int sizeInPixel)
    {
        G.setColor(colorOne);
        G.drawRect(x, y, sizeInPixel, sizeInPixel);
        G.fillRect(x,y,sizeInPixel,sizeInPixel);
        this.x = j;
        this.y = k;
        for (int y = 0; y < sizeOfSquare; y++)

                  for (int x = 0; x < sizeOfSquare; x++)

                  {

                        pnlChessCells[y][x] = new JPanel(new BorderLayout());

                        pnlMain.add(pnlChessCells[y][x]);

                        if (y % 2 == 0)

                              if (x % 2 != 0)

                                    pnlChessCells[y][x].setBackground(colorOne);

                              else

                                    pnlChessCells[y][x].setBackground(colorTwo);

                        else

                              if (x % 2 == 0)

                                    pnlChessCells[y][x].setBackground(colorOne);

                              else

                                    pnlChessCells[y][x].setBackground(colorTwo);

                  }

   
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
