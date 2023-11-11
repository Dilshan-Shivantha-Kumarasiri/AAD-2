package lk.ijse.gdse.structural.decorator;

public class RedShapeDecor extends ShapeDecorator{

    public RedShapeDecor(Shape decor) {
        super(decor);
    }

    @Override
    public void draw() {
        decor.draw();
        setColor(decor);
    }

    private void setColor(Shape color){
        System.out.println("color is red");

    }
}
