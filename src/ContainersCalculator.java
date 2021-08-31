public class ContainersCalculator {
    final int maxBox = 27;
    final int maxContainers = 12;

    public void calculate(int box){
        int containers = 0;
        if(box > 0) {
            containers = printProcess(box);
        }
        printResult(containers);
    }

    private void printResult(int containers){
        int trucks = 0;
        if (containers > 0) {
            trucks = (int) Math.ceil((double) containers / maxContainers);
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");
    }

    private int printProcess(int box){
        int trucks = 0;
        int containers = 0;
        int count = 0;

        while (box > 0) {
            box--;
            if (count % maxBox == 0) {
                if (containers % maxContainers == 0) {
                    System.out.println("Грузовик  " + ++trucks + " :");
                }
                System.out.println("Контейнер " + ++containers  + " :");
            }
            System.out.println("\t Ящик " + ++count);
        }
        return containers;
    }
}
