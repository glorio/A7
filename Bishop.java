/**
 * Represents a Bishop piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

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
        g2.setColor(super.getColor());

        int row = 10; //the rows for drawing
        int rectHeight = (size / row); // the height of the piece
        int rectWidth = (size / row); // the weidth of piece


        // top rectangle
        Rectangle topRect = new Rectangle(x + rectWidth * 4, y, rectWidth * 2, rectHeight * 2);
        g2.fill(topRect);

        // center rectangle
        Rectangle centerRect = new Rectangle(x + rectWidth * 2, y + size - rectHeight * 8, rectWidth * 6, rectHeight * 4);
        g2.fill(centerRect);

        // bottom center rectangle
        Rectangle bottomCenterRect = new Rectangle(x + rectWidth * 3, y + size - rectHeight * 4, rectWidth * 4, rectHeight * 2);
        g2.fill(bottomCenterRect);

        // bottom left rectangle
        Rectangle bottomLeftRect = new Rectangle(x, y + size - rectHeight * 2, rectWidth * 4, rectHeight * 2);
        g2.fill(bottomLeftRect);

        // bottom right rectangle
        Rectangle bottomRightRect = new Rectangle(x + size - rectWidth * 4, y + size - rectHeight * 2, rectWidth * 4, rectHeight * 2);
        g2.fill(bottomRightRect);
    }
}