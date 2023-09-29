package Paterns.Factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType == "Square"){
            return new Square();
        }

        if(shapeType == "Rectangle"){
            return new Rectangle();
        }

        if(shapeType == "Circle") {
            return new Circle();
        }

        return null;
    }

}
