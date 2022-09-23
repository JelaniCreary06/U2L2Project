public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle(150, 200);
        Rectangle R2 = new Rectangle(100);
        Rectangle R3 = new Rectangle();

        R1.setWidth(150);
        R2.setLength(150);
        R3.setWidth(150);

        int sumOfP = R1.perimeter() + R2.perimeter() + R3.perimeter();
        int sumOfA = R1.calculateArea() + R2.calculateArea() + R3.calculateArea();

        System.out.println("The total fencing needed (in feet): " + sumOfP +".\nThe total area (in feet): " + sumOfA);


    }
}
