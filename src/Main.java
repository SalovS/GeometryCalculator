public class Main {
    public static void main(String[] args){
        GeometryCalculator calc = new GeometryCalculator();
        System.out.println(calc.circleArea(2));
        System.out.println(calc.sphereScope(2));
        System.out.println(calc.triangleArea(2,3,4));


        ContainersCalculator cCalc = new ContainersCalculator();
        cCalc.calculate(4400);
    }

}
