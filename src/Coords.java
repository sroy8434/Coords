public class Coords
{
    private double x;
    private double y;

    public Coords(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Coords(double x)
    {
        this.x = x;
        this.y = x;
    }

    public Coords()
    {
        this.x = 0;
        this.y = 0;
    }

    public Coords(Coords other)
    {
        this.x = other.x;
        this.y = other.y;
    }

    double getX()
    {
        return x;
    }

    double getY()
    {
        return y;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void reflectOnXAxis()
    {
        this.y = y/-1;
    }

    public void reflectOnYAxis()
    {
        this.x = this.x/-1;
    }

    public void reflectOnOrigin()
    {
        this.x = x/-1;
        this.y = y/-1;
    }

    public void translate(double horizontal, double vertical)
    {
        this.x = x + horizontal;
        this.y = y + vertical;
    }

    public void dilate(double dilationFactor)
    {
        this.x = x * dilationFactor;
        this.y = y * dilationFactor;
    }

    public double distanceFromOrigin()
    {
        return Math.sqrt(x*x + y*y);
    }

    public double distanceFrom(Coords other)
    {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
    }

    public boolean equals(Coords otherPoint)
    {
        return (this.x == otherPoint.x && this.y == otherPoint.y);
    }

    public double getSlopeOfLineSegment(Coords other)
    {
        return (this.y - other.y)/(this.x - other.x);
    }

     public boolean slopeOfLineSegmentDefined(Coords other)
    {
        return (this.x != other.x);
    }

    public int CompareTo(Coords other)
    {
        if (this.x == other.x)
        {
            if (this.y < other.y)
                return -1;
            if (this.y > other.y)
                return 1;
            return 0;
        }
        if (this.x < other.x)
            return -1;
        return 1;
    }

    public int compareByDistanceFromOrigin(Coords other)
    {
        if (this.distanceFromOrigin() < other.distanceFromOrigin())
            return -1;
        if (this.distanceFromOrigin() > other.distanceFromOrigin())
            return 1;
        return 0;
    }

    public void sortByDistanceFromOrigin(Coords[] points)
    {
        for (int i = 0; i < points.length)
    }

    public void sortByDistanceFromThis()
    {

    }

    public static void sortCoords(Coords[] other)
    {

    }
}
