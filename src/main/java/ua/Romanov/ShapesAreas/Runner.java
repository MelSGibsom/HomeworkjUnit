package ua.Romanov.ShapesAreas;

public class Runner {
    public static void main(String[] args) throws CodeException {
        try {
            System.out.println("Area of Triangle: "+ Geometry2DCalculator.TriangleArea(0, 56.3));
        } catch (CodeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Area of Circle: " + Geometry2DCalculator.CircleArea(Geometry2DCalculator.pi, 34.4));
        } catch (CodeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Area of parallelogram: " + Geometry2DCalculator.ParallelogramArea(67.3, 36.7));
        } catch (CodeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Volume of Cone: " + Geometry3DCalculator.ConeVolume(Geometry2DCalculator.pi, 34.4, 64.6));
        } catch (CodeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Volume of Cylinder: " + Geometry3DCalculator.CylinderVolume(Geometry2DCalculator.pi, 27.4, 56.6));
        } catch (CodeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Volume of tetrahedron: " + Geometry3DCalculator.tetrahedronVolume(45.7));
        } catch (CodeException e) {
            e.printStackTrace();
        }
    }
}
