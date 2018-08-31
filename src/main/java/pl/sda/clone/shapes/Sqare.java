package pl.sda.clone.shapes;

public class Sqare extends Shape {
   private double a;

    public Sqare(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
