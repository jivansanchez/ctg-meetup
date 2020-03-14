package solid.openclosed.goodexample;

import java.util.List;

public class AreaCalculator {

    public double Area(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes)
        {
            area += shape.Area();
        }

        return area;
    }
}
