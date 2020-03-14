package solid.openclosed.badexample;

import java.util.List;

public class AreaCalculator {

    public double Area(List<Rectangle> shapes)
    {
        double area = 0;
        for (Rectangle rectangle : shapes)
        {
            area += rectangle.getWidth() * rectangle.getHeight();
        }

        return area;
    }

    public double AreaShapes(List<Object> shapes)
    {
        double area = 0;
        for (Object shape : shapes)
        {
            if (shape instanceof Rectangle)
            {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            }
        else
            {
                Circle circle = (Circle)shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }

        return area;
    }
}
