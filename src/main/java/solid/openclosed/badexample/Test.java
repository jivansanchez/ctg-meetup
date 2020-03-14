package solid.openclosed.badexample;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(2,3));
        rectangles.add(new Rectangle(4,5));
        rectangles.add(new Rectangle(3,9));
        calculateTotalArea( rectangles );

        List<Object> shapes = new ArrayList<Object>();
        shapes.add(new Rectangle(4,4));
        shapes.add(new Circle(6));
        shapes.add(new Rectangle(2,2));
        shapes.add(new Circle(3));
        calculateTotalAreaShapes( shapes );
    }

    static void calculateTotalArea ( List<Rectangle> rectangles ){
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.Area(rectangles);
        System.out.println("Total Area: "+totalArea);
    }

    static void calculateTotalAreaShapes ( List<Object> shapes ){
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.AreaShapes(shapes);
        System.out.println("Total Area Shapes: "+totalArea);
    }
}
