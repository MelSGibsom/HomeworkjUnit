package ua.Romanov.Tests;

import org.junit.Test;
import ua.Romanov.ShapesAreas.CodeException;
import ua.Romanov.ShapesAreas.Geometry2DCalculator;
import ua.Romanov.ShapesAreas.Geometry3DCalculator;

import static junit.framework.TestCase.*;

public class Geometry3d {
    @Test
    public void checkConeVolume() throws CodeException {
        assertFalse(Geometry3DCalculator.ConeVolume(Geometry2DCalculator.pi, 34.4, 64.6) < 0);
    }

    @Test
    public void checkCylinderVolume() throws CodeException {
        assertFalse(Geometry3DCalculator.CylinderVolume(Geometry2DCalculator.pi, 27.4, 56.6) < 0);
    }

    @Test
    public void checktetrahedronVolume() throws CodeException {
        assertFalse(Geometry3DCalculator.tetrahedronVolume(45.7) < 0);
    }

}


