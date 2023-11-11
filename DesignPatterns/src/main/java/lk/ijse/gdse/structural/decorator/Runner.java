package lk.ijse.gdse.structural.decorator;

public class Runner {

    public static void main(String[] args) {

        Shape shape = new Circle();

        ShapeDecorator shapeDecorator = new RedShapeDecor(shape);
        shapeDecorator.draw();

    }
}
