/**
 * Created by SpacePunch on 21.10.2015.
 */
public interface Crossable {

   boolean isCrossed(Segment anotherSegment);

   Coordinate intersectionPoint(Segment segmentOne, Segment segmentTwo);


}

