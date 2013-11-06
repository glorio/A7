import java.util.ArrayList;
/**
 * This Chessboard class is to hold the Board object and a collection of Pieces
 * This collection is to be represented as an ArrayList.
 * @author Glorio Yulianto
 * @version v1 6 nov 2013
 */
public class Chessboard
{
    ArrayList<Board> chessboardList = new ArrayList<>(); 
    ArrayList<Piece> pieceList = new ArrayList<>(); 
    /**
     * Constructor for objects of class Chessboard
     */
    public Chessboard(Board a, Piece b)
    {
        chessboardList.add(a);
        pieceList.add(b);
        
    }
    
    public void draw (Graphics2D G, int x, int y, int sizeInPixel)
    {
        this.x = x;
        this.y = y;
   
    }
    
}
