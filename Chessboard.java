import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * This Chessboard class is to hold the Board object and a collection of Pieces
 * This collection is to be represented as an ArrayList.
 * @author Glorio Yulianto
 * @version v1 6 nov 2013
 */
public class Chessboard
{
    ArrayList<Board> chessboardList = new ArrayList<>(); 
    ArrayList<ArrayList<Piece>> pieceList = new ArrayList<>(); 
    /**
     * Constructor for objects of class Chessboard
     */
    public Chessboard(Board a, ArrayList<Piece> b)
    {
        chessboardList.add(a);
        pieceList.add(b);
        
    }
    
    public void draw (Graphics2D G, int x, int y, int sizeInPixel)
    {
        G.drawRect(x, y, sizeInPixel, sizeInPixel);
        G.fillRect(x,y,sizeInPixel,sizeInPixel);
    }
    
}
