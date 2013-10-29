/**
 * Represents a Rook piece.
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

public class Rook extends Piece {
    /**
     * Creates a Rook piece.
     */
    public Rook(Color color, int file, int rank) {
        super(color, file, rank);
    }

   /**
       Draws the Rook onto a square to be shown on a given Graphics2D object
       @param g2 the Graphics2D object.
       @param x the x-coordinate of the upper-left corner of the square
       @param y the y-coordinate of the upper-left corner of the square
       @param size the size in pixels of the square
   */

    public void draw(Graphics2D g2, int x, int y, int size) {
        /*Polygon p = new Polygon();
        for (int i = 0; i < 5; i++) {
              p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
                  (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));
        }

        g2.drawPolygon(p);*/

        // background rectangle
        Rectangle backgroundRect = new Rectangle(x, y, size, size);
        g2.draw(backgroundRect);

        double row = 10;
        int rectHeight = (int) (size / row);
        int rectWidth = (int) (size / row);

        /*// bottom rectangle
        Rectangle bottomRect = new Rectangle(x, y + size - rectHeight, size, rectHeight);
        g2.draw(bottomRect);

        // 2nd from bottom rectangle
        Rectangle bottomRect2 = new Rectangle(x + rectWidth, y + size - rectHeight * 2, size - rectWidth * 2, rectHeight);
        g2.draw(bottomRect2);

        // 3rd from bottom rectangle
        Rectangle bottomRect3 = new Rectangle(x + rectWidth * 2, y + size - rectHeight * 3, size - rectWidth * 4, rectHeight);
        g2.draw(bottomRect3);*/

        // constructs the 3 base rectangles
        for(int i = 1; i <= 3; i++) {
            Rectangle rect = new Rectangle(x + rectWidth * (i - 1), y + size - rectHeight * i, size - rectWidth * (i - 1) * 2, rectHeight);
            g2.fill(rect);
        }

        //g2.setColor(super.getColor()); // set polygon color
    }
}