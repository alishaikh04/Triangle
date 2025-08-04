public class Triangle {
    private double a;
    private double b;
    private double c;
    private static int count = 0;

    // Default constructor
    public Triangle() 
    {
        this(1, 1, 1);
    }

    // One side constructor (equilateral)
    public Triangle(double side) 
    {
        this.a = side;
         this.b = side;
          this.c = side;
    }

    // Two sides constructor (isosceles)
    public Triangle(double a, double b) 
    {
        this(a, b, Math.sqrt(a * a + b * b)); // Assume right triangle by default
    }

    // Three sides constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }

    // Copy constructor
    public Triangle(Triangle other) {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public boolean isRightAngle() {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return Math.abs((sides[0] * sides[0] + sides[1] * sides[1]) - (sides[2] * sides[2])) < 1e-9;
    }

    public static int Count() {
        return count;
    }

    @Override
    public String toString() {
        return "Triangle sides: " + "\n side A : " + a +  "\n side B : " + b + "\n side C : " + c;
    }
}

