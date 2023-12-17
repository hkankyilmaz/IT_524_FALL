public class Pen {


    public void draw (Rectangle rec){

        System.out.println("Rectangle width "+ rec.getWidth()+"\n" +
                           "Rectangle height "+ rec.getHeight()+"\n" +
                           "Rectangle color "+ rec.getColor()+"\n" +
                           "Rectangle is  drawed"

        );

    }

    public void draw(Circle cir) {

        System.out.println("Circle width "+ cir.getRadius()+"\n" +
                "Rectangle height "+ cir.getColor()+"\n" +
                "Circle  drawed"

        );


    }

    public void changeColor(String color, Circle cir) {

        cir.setColor(color);
        System.out.println("color changed " + cir.getColor());
    }

    public void changeColor(String color, Rectangle rec) {

        rec.setColor(color);
        System.out.println("color changed " + rec.getColor());
    }


}
