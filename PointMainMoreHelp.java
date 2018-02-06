import java.awt.*;
// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainMoreHelp {
    public static void main(String[] args) {
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
        // create two Point objects
        PointMore p1 = new PointMore(10, 20);
        PointMore p2 = new PointMore(20, 30);

        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin is = " +
                           p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin is = " +
                           p2.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.translate(11, 6);
        p2 = p2.translate(1, 7);

        // print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
    }
}
