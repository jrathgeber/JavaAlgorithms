package Paterns.Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapefactory = new ShapeFactory();

        Shape shape1 = shapefactory.getShape("Square");

        shape1.draw();


    }

}
