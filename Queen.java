/**
 * Represents a Queen piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Queen extends Piece {
    /**
     * Creates a Queen piece.
     */
    public Queen(Color color, int file, int rank) {
        super(color, file, rank);
    }

   /**
       Draws the Queen onto a square to be shown on a given Graphics2D object
       @param g2 the Graphics2D object.
       @param x the x-coordinate of the upper-left corner of the square
       @param y the y-coordinate of the upper-left corner of the square
       @param size the size in pixels of the square
   */

    public void draw(Graphics2D g2, int x, int y, int size) {
        // background rectangle
        Rectangle backgroundRect = new Rectangle(x, y, size, size);
        g2.draw(backgroundRect);

        double column = 7;
        int tipTopRectWidth = (int) (size / column);

        double row = 10;
        int rectHeight = (int) (size / row);
        int rectWidth = (int) (size / row);

       // constructs the 2 top rectangles
        for(int i = 1; i <= 3; i++) {
            Rectangle rect = new Rectangle(x + (i - 1) * 3 * tipTopRectWidth, y, tipTopRectWidth, rectHeight * 2);
            g2.draw(rect);
        }

        // center rectangle
        Rectangle centerRect = new Rectangle(x + rectWidth, y + rectHeight * 2, rectWidth * 8, rectHeight * 5);
        g2.draw(centerRect);

        // constructs the 3 base rectangles
        for(int i = 1; i <= 3; i++) {
            Rectangle rect = new Rectangle(x + rectWidth * 2, y + size - rectHeight * i, size - rectWidth * 4, rectHeight);
            g2.draw(rect);
        }
    }
}