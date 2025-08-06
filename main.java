public class main{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();                        // Default: all sides = 1
        Triangle t2 = new Triangle(5.0);                     // Equilateral
        Triangle t3 = new Triangle(3.0, 4.0);                // Right-angled (Pythagorean triple)
        Triangle t4 = new Triangle(7.0, 24.0, 25.0);         // Right-angled triangle
        Triangle t5 = new Triangle(t2);                      // Copy of t2

        System.out.println("T1:\n" + t1);
        System.out.println("Is T1 right-angled? " + t1.isRightAngle());

        System.out.println("T2:\n" + t2);
        System.out.println("Is T2 right-angled? " + t2.isRightAngle());

        System.out.println("T3:\n" + t3);
        System.out.println("Is T3 right-angled? " + t3.isRightAngle());

        System.out.println("T4:\n" + t4);
        System.out.println("Is T4 right-angled? " + t4.isRightAngle());

        System.out.println("T5 (copy of T2):\n" + t5);
        
        System.out.println("Total Triangle objects created: " + Triangle.count);
    }
}
