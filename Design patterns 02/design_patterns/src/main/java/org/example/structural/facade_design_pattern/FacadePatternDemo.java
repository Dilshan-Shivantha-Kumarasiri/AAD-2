package org.example.structural.facade_design_pattern;


public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }

}
