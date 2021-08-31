public class ContainersCalculator {
    final int maxBox = 27;
    final int maxContainers = 12;

    public void calculate(int box){
        if(box > 0) {
            printProcess(box);
        }
        printResult(box);
    }

    private void printResult(int box){
        int containers = 0;
        int trucks = 0;
        if (box > 0) {
            containers = (int) Math.ceil((double) box / maxBox);
            trucks = (int) Math.ceil((double) containers / maxContainers);
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");
    }

    private void printProcess(int box){
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
    }
}
