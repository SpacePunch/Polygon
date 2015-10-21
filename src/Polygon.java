/**
 * Created by SpacePunch on 21.10.2015.
 */
public class Polygon extends Segment{

    public Segment[] segments;

    Polygon(Segment[] segments) {
        this.segments = segments;

    }

    //по сути создаем отрезок
    Polygon(Coordinate first, Coordinate second) {
        super(first, second);
        segments = new Segment[1];
        segments[0] = super.getSegment();
    }


    //можно этот метод переименовать и SOF не будет, но будет не так красиво
    @Override
    public boolean isCrossed(Segment anotherSegment) {
        for (Segment segment : segments){
            if (segment.isCrossed(anotherSegment)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Coordinate intersectionPoint(Segment segmentOne, Segment segmentTwo) {
        return super.intersectionPoint(segmentOne, segmentTwo);
    }
}

