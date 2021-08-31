public class GeometryCalculator {
    public double circleArea(double R){
        return Math.PI * R * R;
    }

    public double triangleArea(double a, double b, double c){
        if(checkTrianle(a, b, c)) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }

    public double sphereScope(double R){
        return 4 * Math.PI * R * R / 3;
    }

    public boolean checkTrianle(double a, double b, double c){
        if(a > b + c)
            return false;
        if(b > a + c)
            return false;
        if(c > a + b)
            return false;
        return true;
    }
}
