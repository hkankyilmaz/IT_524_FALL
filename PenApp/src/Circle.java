public class Circle extends Shape {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drew a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erased a circle");

    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changed the color of a circle");
    }
}
