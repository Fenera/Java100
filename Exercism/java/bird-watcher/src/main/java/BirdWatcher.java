class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int day: this.birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, this.birdsPerDay.length); // set the limit to whichever is smaller

        for(int i = 0; i < limit; i++){
            sum += this.birdsPerDay[i];
        }


        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int day: this.birdsPerDay){
            if(day >= 5){
                count ++;
            }
        }
        return count;
    }
}
