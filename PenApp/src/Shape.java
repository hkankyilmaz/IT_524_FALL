public abstract class  Shape {

    public abstract void draw();

    public abstract void erase();

    public abstract void changeColor(String color);

    public Shape() {
        System.out.println("Shape constructor");
    }
}
