package ua.Romanov.ShapesAreas;

public class Geometry3DCalculator {
    public static double ConeVolume(double pi,double r,double h) throws CodeException{
        double coneArea=(pi*r*r*h)/3;
        if (coneArea<=0) {
            throw new CodeException("Результат должен быть больше нуля");
        }
        return coneArea;
    }
    public static double CylinderVolume(double pi,double r,double h) throws CodeException{
        double cylinderArea = pi*r*r*h;
        if (cylinderArea<=0) {
            throw new CodeException("Результат должен быть больше нуля");
        }
        return  cylinderArea;
    }
    public static double tetrahedronVolume(double a) throws CodeException{
        double tetraVolume=(Math.sqrt(2)*a*a*a)/12;
        if (tetraVolume<=0) {
            throw new CodeException("Результат должен быть больше нуля");
        }
        return tetraVolume;
    }
}
