package chapter03.item08.composition;

/**
 * Created by Jang Jeong Hyeon on 2017-09-06.
 */

// simple immutable tow-dimensional integer point class - Page 37
public class Point {
    private final int x;
    private final int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point))
            return false;
        Point p = (Point) obj;
        return p.x == this.x && p.y == this.y;
    }

    //See item 9

    @Override
    public int hashCode() {
        return 31*x+y;
    }
}
