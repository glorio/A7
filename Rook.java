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
        Rectangle base = new Rectangle(x, y, size, size);
        g2.fill(base);

        //g2.setColor(super.getColor()); // set polygon color
    }
}