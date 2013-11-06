/**
 * Represents a Pawn piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pawn extends Piece {
    /**
     * Creates a Pawn piece.
     */
    public Pawn(Color color, int file, int rank) {
        super(color, file, rank);
    }

   /**
       Draws the Pawn onto a square to be shown on a given Graphics2D object
       @param g2 the Graphics2D object.
       @param x the x-coordinate of the upper-left corner of the square
       @param y the y-coordinate of the upper-left corner of the square
       @param size the size in pixels of the square
   */

    public void draw(Graphics2D g2, int x, int y, int size) {
        g2.setColor(super.getColor());

        int row = 10; //the rows for drawing
        int rectHeight = (size / row); // the height of the piece
        int rectWidth = (size / row); // the weidth of piece


        // top rectangle
        Rectangle topRect = new Rectangle(x + rectWidth * 4, y, size - rectWidth * 8, rectHeight * 2);
        g2.fill(topRect);

        // center rectangle
        Rectangle centerRect = new Rectangle(x + rectWidth * 3, y + size - rectHeight * 8, size - rectWidth * 6, rectHeight * 6);
        g2.fill(centerRect);

        // bottom rectangle
        Rectangle bottomRect = new Rectangle(x + rectWidth * 2, y + size - rectHeight * 2, size - rectWidth * 4, rectHeight * 2);
        g2.fill(bottomRect);
    }
}