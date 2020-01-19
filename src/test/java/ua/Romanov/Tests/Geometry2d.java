package ua.Romanov.Tests;

import org.junit.Test;
import ua.Romanov.ShapesAreas.CodeException;
import ua.Romanov.ShapesAreas.Geometry2DCalculator;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static ua.Romanov.ShapesAreas.Geometry2DCalculator.ParallelogramArea;

public class Geometry2d {
    @Test
    public void checkTriangleArea() throws CodeException {
        assertEquals(1.125, Geometry2DCalculator.TriangleArea(1.5, 1.5));
        assertFalse(Geometry2DCalculator.TriangleArea(1.5, 1.5) < 0);
            }
            @Test
            public void checkCircleArea() throws CodeException {
        assertFalse(Geometry2DCalculator.CircleArea(Geometry2DCalculator.pi,34.4)<0);
            }
            @Test
            public void checkParallelogramArea() throws CodeException {
                assertFalse(ParallelogramArea(67.3,36.7)<0);
            }


}