/**
 * Created by SpacePunch on 21.10.2015.
 */
public class Segment implements Crossable {

    private Coordinate first, second;

    Segment(Coordinate first, Coordinate second){
        this.first = first;
        this.second = second;
    }

    //пустой конструктор для наследования
    Segment(){
    }

    protected Segment getSegment(){
        return this;
    }

    public Coordinate getSecond() {
        return second;
    }

    public Coordinate getFirst() {
        return first;
    }

    @Override
    public boolean isCrossed(Segment anotherSegment){

        double v1, v2, v3, v4;

        v1 = (anotherSegment.getSecond().getX() - anotherSegment.getFirst().getX()) * (this.getFirst().getY() - anotherSegment.getFirst().getY()) -
                (anotherSegment.getSecond().getY() - anotherSegment.getFirst().getY()) * (this.getFirst().getX() - anotherSegment.getFirst().getX());

        v2 = (anotherSegment.getSecond().getX() - anotherSegment.getFirst().getX()) * (this.getSecond().getY() - anotherSegment.getFirst().getY()) -
                (anotherSegment.getSecond().getY() - anotherSegment.getFirst().getY()) * (this.getSecond().getX() - anotherSegment.getFirst().getX());

        v3 = (this.getSecond().getX() - this.getFirst().getX()) * (anotherSegment.getFirst().getY() - this.getFirst().getY()) -
                (this.getSecond().getY() - this.getFirst().getY()) * (anotherSegment.getFirst().getX() - this.getFirst().getX());

        v4 = (this.getSecond().getX() - this.getFirst().getX()) * (anotherSegment.getSecond().getY() - this.getFirst().getY()) -
                (this.getSecond().getY() - this.getFirst().getY()) * (anotherSegment.getSecond().getX() - this.getFirst().getX());

        return (v1 * v2 < 0) & (v3 * v4 < 0);
    }

    @Override
    public Coordinate intersectionPoint(Segment segmentOne, Segment segmentTwo) {
        //нагуглить метод
        return null;
    }

}
/* формулы из интернетов
   v1:=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
   v2:=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
   v3:=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
   v4:=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);

   Intersection:=(v1*v2<0) and (v3*v4<0);
*/
