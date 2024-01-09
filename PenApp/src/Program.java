public class Program {

    public static void main(String[] args) {

        Pencil pencil = new Pencil();
        Shape circle = new Circle(5, "red");
        Shape rectangle = new Rectangle(10, 5, "blue");

        pencil.draw(circle);
        pencil.draw(rectangle);

        pencil.erase(circle);
        pencil.erase(rectangle);

        circle.changeColor("green");
        rectangle.changeColor("yellow");

    }
}
