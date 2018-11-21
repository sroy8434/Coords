public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(QuadraticEquation other)
    {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
    }
    public QuadraticEquation()
    {
        a = 1;
        b = 0;
        c = 0;
    }

    public QuadraticEquation(double coefficient, Coords vertex)
    {
        a = coefficient;
        double h = vertex.getX();
        double k = vertex.getY();
        b = -2 * a * h;
        c = a * h * h + k;
    }

    public String toString()
    {
        return "" + a + "x^2 + " + b + "x + " + c;
    }

    public double getDiscriminant()
    {
        return b*b - 4*a*c;
    }

    public boolean hasRealRoots()
    {
        return getDiscriminant() >= 0;
    }
    public boolean hasEqualRoots()
    {
        return getDiscriminant() == 0;
    }

    public boolean hasMinimum()
    {
        return a > 0;
    }

    public boolean hasMaximum()
    {
        return a < 0;
    }

    public LinearEquation axisOfSymmetry()
    {

    }
    public Coords vertex()
    {

    }

    public LinearEquation derivative()
    {

    }

    public QuadraticRoots getRoots()
    {
        if (hasRealRoots())
        {
            double r1 = 
        }
    }
}
