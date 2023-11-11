package lk.ijse.gdse.creationa.Factory;

import java.awt.*;

public class Factory {

    // we use factory design pattern to hide the object creation

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }else {
            if (shapeType.equalsIgnoreCase("circle")) {
                return new Circle();
            }else if(shapeType.equalsIgnoreCase("Rectangle")){
                return new Rectangle();
            }else if (shapeType.equalsIgnoreCase("square")){
                return new Square();
            }
        }
        return null;
    }
}
