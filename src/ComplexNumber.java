public class ComplexNumber
{
    //a + bi
    private double a;
    private double b;

    public ComplexNumber(double realPart, double imaginaryPart)
    {
        a = realPart;
        b = imaginaryPart;
    }

    public ComplexNumber(ComplexNumber other)
    {
        this.a = other.a;
        this.b = other.b;
    }

    public double getRealMagnitude()
    {
        return (a);
    }

    public double getImaginaryMagnitude()
    {
        return (b);
    }

    public String toString()
    {
        return (a + " + " + b + "i");
    }

    public void add(double scalar)
    {
        a += scalar;
    }

    public void add(ComplexNumber other)
    {
        this.a += other.a;
        this.b += other.b;
    }

    public void subtract(double scalar)
    {
        a -= scalar;
    }

    public void subtract(ComplexNumber other)
    {
        this.a -= other.a;
        this.b -= other.b;
    }

    public void multiply(double scalar)
    {
        a *= scalar;
        b *= scalar;
    }

    public void multiply(ComplexNumber other)
    {
        double c = other.a;
        double d = other.b;

        double mutatedA = (a*c - b*d);
        double mutatedB = (a*d + b*c);

        a = mutatedA;
        b = mutatedB;
    }

    public boolean divideBy(double scalar)
    {
        if (scalar == 0)
            return false;

        a /= scalar;
        b /= scalar;
        return true;
    }

    public boolean divideBy(ComplexNumber other)
    {
        double c = other.a;
        double d = other.a;

        if (c == 0 && d == 0)
            return false;

        double mutatedA = (a*c + b*d)/(c*c + d*d);
        double mutatedB = (b*c - a*d)/(c*c + d*d);

        a = mutatedA;
        b = mutatedB;
        return true;
    }

}
