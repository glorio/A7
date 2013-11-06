import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;
/**
 * create a two colors of squares chessboard fill the color.
 * 
 * @author Glorio Yulianto
 * @version 1.1 30 Oct 2013
 */
public class Board
{
    
    private Color colorOne, colorTwo; //color one and color two for board
    private int squareInBoard = 8; // how many number of rows and columns
    private int x, y; // x and y coordinate

    /**
     * Constructor for objects of class Board
     */
    public Board(Color one, Color two)
    {
        colorOne = one;
        colorTwo = two;
        
    }
    
    /**
     * draw a chessboard
     * @param G is the Graphics2D object
     * @param j is the x coordinate
     * @param k is the y coordinate
     * @param sizeInPixel the size in pixel
     */
    public void draw (Graphics2D G, int j, int k, int sizeInPixel)
    {
        G.drawRect(x, y, sizeInPixel, sizeInPixel);
        int smallSquare = sizeInPixel/squareInBoard;
        this.x = j;
        this.y = k;
        for (int y = 0; y < squareInBoard; y++)

                  for (int x = 0; x < squareInBoard; x++)

                  {
                        
                        Rectangle r = new Rectangle(x*smallSquare,y*smallSquare,smallSquare,smallSquare);
                        if (y % 2 == 0)
                        {
                            if (x % 2 == 0)
                            G.setColor(colorOne);
                            else
                            G.setColor(colorTwo);
                        }
                        else
                        {
                            if (x % 2 == 0)
                            G.setColor(colorTwo);
                            else
                            G.setColor(colorOne);
                        }
                            G.fill(r);

                  }
                  

   
    }
    
    /**
     * this method is to return the color one
     * @return colorOne the color one
     */
    public Color getColorOne ()
    {
        return colorOne;
    }
 
    /**
     * this method is to return the color two
     * @return colorOne the color two
     */
    
    public Color getColorTwo ()
    {
        return colorTwo;
    }
    
    /**
     * this method is to return how many squares in board
     * @return how many of the squares on board
     */
    public int getSquaresInBoard()
    {
        return squareInBoard;
    }
    
}
