package lk.ijse.gdse.structural.facade;

import lk.ijse.gdse.creationa.Factory.Shape;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawRectangle();
    }
}
