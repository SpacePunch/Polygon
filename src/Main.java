import java.io.*;


/**
 * Created by SpacePunch on 21.10.2015.
 */

public class Main {

    public static void main(String[] args){

        Polygon polygon = new Polygon(new Coordinate(0, 2), new Coordinate(2, 1));
        Segment segment = new Segment(new Coordinate(1, 1), new Coordinate(4, 3));

        System.out.println(polygon.isCrossed(segment));

    }
}
