

import java.awt.Point;
import java.util.ArrayList;

public class Vertex
{
    Point p;
    boolean hovered;
    Cloud inCloud;
    ArrayList<Edge> inEdges;

    public Vertex(Point x) {
        // constructor
        p = x;
        hovered = false;
        inEdges = new ArrayList<Edge>();
        inCloud = new Cloud();
    }
}
