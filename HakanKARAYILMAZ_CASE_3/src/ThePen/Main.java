package ThePen;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(2,5,"Red");
        Circle cir = new Circle(3,"Blue");
        Pen pen = new Pen();


        pen.draw(rec);
        pen.draw(cir);

        pen.changeColor("Blue",cir);
        pen.changeColor("Blue",rec);



    }
}