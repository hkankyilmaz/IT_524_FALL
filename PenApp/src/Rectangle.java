public class Rectangle extends Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drew a rectangle");

    }

    @Override
    public void erase() {
        System.out.println("Erased a rectangle");

    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changed the color of a rectangle");

    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
