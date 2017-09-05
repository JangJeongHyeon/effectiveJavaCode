package chapter03.item08.composition;

/**
 * Created by Jang Jeong Hyeon on 2017-09-06.
 */

// Add a value component without violating the equals contract - Page 40
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(final int x, final int y, final Color color){
        if(color == null)
            throw new NullPointerException();
        point = new Point(x,y);
        this.color = color;
    }


    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override
    public int hashCode() {
        return point.hashCode() * 33 + color.hashCode();
    }
}
