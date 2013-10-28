/**
 * @(#)PieceDrawingTester.java
 *
 *
 * @author Luke Sieben
 * @version 2013-10-28
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PieceDrawingTester {
    /**
     * For testing out pieces drawing.
     */
    public static void main(String[] args) {
        int frameWidth = 600;
        int frameHeight = 600;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setTitle("Piece Drawing Tester");
        frame.setVisible(true);

        Piece piece = new Rook(Color.black, 1, 1);
        BufferedImage bi = new BufferedImage(600,400,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        piece.draw(g, 0, 0, frameWidth);

        JLabel label = new JLabel(new ImageIcon(bi));

        JPanel panel = new JPanel();
        panel.add(label);

        frame.add(panel);
   }
}