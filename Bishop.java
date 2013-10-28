/**
 * Represents a Bishop piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;

public class Bishop extends Piece {
    /**
     * Creates a Bishop piece.
     */
    public Bishop(Color color, int file, int rank) {
        super(color, file, rank);
    }

   /**
       Draws the Bishop onto a square to be shown on a given Graphics2D object
       @param g2 the Graphics2D object.
       @param x the x-coordinate of the upper-left corner of the square
       @param y the y-coordinate of the upper-left corner of the square
       @param size the size in pixels of the square
   */

    public void draw(Graphics2D g2, int x, int y, int size) {
        // TODO
    }
}