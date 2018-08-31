package pl.sda.clone.shapes;

public class Circle extends  Shape {
private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public void printName() {

        //super.printName(); - wywołanie metody z klasy nadrzędnej
        System.out.println("Jestem circle");
    }
public void printDiameter(){
    System.out.println("Srednica: "+ 2*this.radius);
}
}
