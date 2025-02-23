public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate;

        if (speed == 9){
            successRate = 0.8;
        }
        else if (speed == 10){
            successRate = 0.77;
        }
        else if (speed >= 1 && speed <= 4){
            successRate = 1;
        }
        else{ // 5 - 8
            successRate = .90;
        }
        return 221 * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
