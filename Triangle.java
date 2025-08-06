public class Triangle{
  double sideA;
  double sideB;
  double sideC;
  public static int count;
  
  Triangle()
  {
   this.sideA = 1.0;
   this.sideB = 1.0;
   this.sideC = 1.0;
  }
  // One-Side constructor (For Equilateral triangle)
  Triangle(double side)
  {
    this.sideA = side;
    this.sideB = side;
    this.sideC = side;
    count++;
  }
  // Two-Side Constructor (For Isosceles Triangle)
  Triangle(double a, double b)
  {
    this.sideA = a;
    this.sideB = b;
    this(a,b, Math.sqrt(a*a + b*b));
    count++;
  }
  // Three-Side Constructor (For Right AngLe Triangle)
  Triangle(double a, double b, double c) {
        this.sideA = a;
        this. sideB = b;
        this.sideC = c;
        count++;
    }

  Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;
    }

    public double perimeter()
    {
       return sideA + sideB + sideC;
     }

     public boolean isRightAngle()
     {
        if(sideA > sideB && sideA > sideC)
        {
            return sideA * sideA == sideB * sideB + sideC * sideC;
        }
        else if(sideB > sideA && sideB > sideC)
        {
            return sideB * sideB == sideA * sideA + sideC * sideC;
        }
       else 
       {
        return sideC * sideC == sideA * sideA + sideB * sideB;
       }
}
 public String toString()
 {
    return "The value of side of Triangle are" + "\nSIDE A : " + sideA 
    + "\nSIDE B : " + sideB + "\nSIDE C : " + sideC;
 } 
}

