public class main {
    public static void main(String[] args) {
        Triangle t1 =  new Triangle();

        Triangle t2 = new Triangle(3);

        Triangle t3 = new Triangle(3,4);

        Triangle t4 = new Triangle(3,4,5);

        Triangle  t5 = new Triangle(t4);

        System.out.println(t1);
        System.out.println("perimeter : " + t1.perimeter());
        System.out.println("Right angle : " + t1.isRightAngle());

        System.out.println("perimeter : " + t2.perimeter());
        System.out.println("Right angle : " + t2.isRightAngle());


        System.out.println("perimeter : " + t3.perimeter());
        System.out.println("Right angle : " + t3.isRightAngle());

                System.out.println("perimeter : " + t4.perimeter());
        System.out.println("Right angle : " + t4.isRightAngle());

                System.out.println("perimeter : " + t5.perimeter());
        System.out.println("Right angle : " + t5.isRightAngle());

    }
}
