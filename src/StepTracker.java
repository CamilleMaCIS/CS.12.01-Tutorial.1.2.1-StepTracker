public class StepTracker {
    //properties
    private int minSteps;
    private int totalSteps;
    private int activeSteps;
    private int totalDays;
    private int activeDays;

    //constructor
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeSteps = 0;
        this.activeDays = 0;
    }

    //methods
    public void addDailySteps(int newSteps){
        this.totalDays++;
        this.totalSteps += newSteps;
        //if newSteps >= 10000, for example, then newSteps counts as active
        if (newSteps >= minSteps){
            this.activeDays++;
            this.activeSteps += newSteps;
        }
    }

    //returns total amount of steps / total amount of days
    //average steps per day
    public double averageSteps(){
        double days = this.totalDays;
        //if divisor is 0, answer will be undefined
        if (days == 0){
            return 0.0;
        }
        return this.totalSteps / days;
    }

    //returns the minimum steps for an active Day: in this case, the user inputs must have at least 10000 steps
    public int getStepsForActiveDay(){
        return this.minSteps;
    }

    /** In the test class, there was activeDays() and also getActiveDays(),
     * however in the README file it said the activeDays() method returns amount of active days.
     * So, there is a repeat of methods.
     * I added getActiveDays() anyway because I need to pass the StepTrackerTest. */
    //returns returns the number of active DAYS
    public int getActiveDays(){
        return this.activeDays;
    }
    //returns returns the number of active DAYS
    public int activeDays(){
        return this.activeDays;
    }

    //returns the number of active STEPS
    public int getActiveSteps(){
        return this.activeSteps;
    }

    //returns TOTAL amount of STEPS, including the inactive steps
    public int getTotalSteps(){
        return this.totalSteps;
    }

    //returns TOTAL amount of DAYS, including the inactive days
    public int getDays(){
        return this.totalDays;
    }

}
