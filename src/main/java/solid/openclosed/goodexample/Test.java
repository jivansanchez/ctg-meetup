package solid.openclosed.goodexample;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(4,4));
        shapes.add(new Circle(6));
        shapes.add(new Rectangle(2,2));
        shapes.add(new Circle(3));
        calculateTotalArea( shapes );
    }

    static void calculateTotalArea ( List<Shape> shapes ){
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.Area(shapes);
        System.out.println("Total Area: "+totalArea);
    }

}
