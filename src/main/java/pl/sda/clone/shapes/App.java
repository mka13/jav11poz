package pl.sda.clone.shapes;

public class App {
    public static void main(String[] args) {

        Circle newCircle= new Circle(5);
        newCircle.printName();
        System.out.println(newCircle.area());
        Sqare newSqare = new Sqare(10);
        newSqare.printName();
        System.out.println(newSqare.perimeter());
        Shape circle = new Circle(10);
        ((Circle) circle).printDiameter();
    }
}
