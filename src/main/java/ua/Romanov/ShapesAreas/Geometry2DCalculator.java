package ua.Romanov.ShapesAreas;

public class Geometry2DCalculator {
    public static final double pi=3.14;
    public static double TriangleArea(double a, double b) throws CodeException{
        double  triangleArea=(a*b)/2;
        if (triangleArea<=0) {
            throw new CodeException("Результат должен быть больше нуля");
        }
        return triangleArea;

    }
    public static double CircleArea(double pi, double r)throws CodeException{
        double circleArea=pi*r*r;
        if (circleArea<=0) {
            throw new CodeException("Результат должен быть больше нуля");
        }
        return circleArea;
    }
public static double ParallelogramArea(double a, double h)throws CodeException{
    double parallelogramArea=a*h;
    if (parallelogramArea<=0) {
        throw new CodeException("Результат должен быть больше нуля");
    }
    return parallelogramArea;
 }



}
