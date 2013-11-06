/**
 * Represents a Knight piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Knight extends Piece {
    /**
     * Creates a Knight piece.
     */
    public Knight(Color color, int file, int rank) {
        super(color, file, rank);
    }

   /**
       Draws the Knight onto a square to be shown on a given Graphics2D object
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

        // left rectangle
        Rectangle leftRect = new Rectangle(x, y, rectWidth * 5, rectHeight * 4);
        g2.fill(leftRect);

        // right rectangle
        Rectangle rightRect = new Rectangle(x + rectWidth * 5, y, rectWidth * 5, rectHeight * 10);
        g2.fill(rightRect);
    }
}