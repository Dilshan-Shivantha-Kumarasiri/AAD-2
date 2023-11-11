package lk.ijse.gdse.structural.decorator;

public  abstract class  ShapeDecorator implements Shape{

    protected Shape decor;

    public ShapeDecorator(Shape decor) {
        this.decor = decor;
    }


    @Override
    public void draw() {
        decor.draw();
    }
}
