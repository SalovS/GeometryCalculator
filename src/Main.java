public class Main {
    public static void main(String[] args){
        containers(4400);
    }
    public static double circleArea(double R){
        return Math.PI * R * R;
    }
    public static double triangleArea(double a, double b, double c){
        if(checkTrianle(a, b, c))
            return 0;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static double sphereScope(double R){
        return 4 * Math.PI * R * R / 3;
    }
    public static boolean checkTrianle(double a, double b, double c){
        if(a > b + c)
            return false;
        if(b > a + c)
            return false;
        if(c > a + b)
            return false;
        return true;
    }
    public static void containers(int box){
        int trucks = 0;
        int containers = 0;
        int count = 0;
        if(box > 0) {
            while (box > 0) {
                box--;
                if (count % 27 == 0) {
                    if (containers % 12 == 0) {
                        System.out.println("Грузовик  " + ++trucks + " :");
                    }
                    System.out.println("Контейнер " + ++containers  + " :");
                }
                System.out.println("\t Ящик " + ++count);
            }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");
    }
}
