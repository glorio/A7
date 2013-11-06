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
    ArrayList<Board> chessboardList = new ArrayList<>(); //an arrayList of Board objects
    ArrayList<ArrayList<Piece>> pieceList = new ArrayList<>(); //arraylist of an arraylist of Piece
    /**
     * Constructor for objects of class Chessboard
     */
    public Chessboard(Board a, ArrayList<Piece> b)
    {
        chessboardList.add(a);
        pieceList.add(b);
        
    }
     /**
     * draw pieces on a chessboard
     * @param G is the Graphics2D object
     * @param j is the x coordinate
     * @param k is the y coordinate
     * @param sizeInPixel the size in pixel
     */
    public void draw (Graphics2D G, int x, int y, int sizeInPixel)
    {
        chessboardList.get(0).draw(G,x,y,sizeInPixel);
        for (Piece p : pieceList.get(0))
        {
            int smallSquare = sizeInPixel/(chessboardList.get(0).getSquaresInBoard());
            
            p.draw(G,(p.getFile()-1)*smallSquare,(p.getRank()-1)*smallSquare,smallSquare);
            
        }
    }
    
}
