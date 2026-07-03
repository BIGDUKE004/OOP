public class LinearRegression {
    private int [] hoursOfStudent;
    private int [] scores;
    private int sumOfHours;
    private int sumOfScores;
    private int summation;
    private int sumOfHoursSquare;
    private double slope;
    private double averageOfHours;
    private double averageOfScores;
    private double intercept;
    private String finalCalculation;

    public void setHoursOfStudent(int [] hours){
        this.hoursOfStudent = hours;
    }

    public int [] getHoursOfStudent(){
        return hoursOfStudent;
    }

    public void setExamScores(int [] scores){
        this.scores = scores;
    }

    public int [] getScores(){
        return scores;
    }

    public void calculateHours(int[] hours) {
        int sum = 0;
        for(int count = 0; count < hours.length; count++){
            sum += hours[count];
        }
        this.sumOfHours = sum;
    }

    public int getSumOfHours(){
        return sumOfHours;
    }

    public void calculateExamScore(int[] scores) {
        int sum = 0;
        for(int count = 0; count < scores.length; count++){
            sum += scores[count];
        }
        this.sumOfScores = sum;
    }

    public int getSumOfScores(){
        return sumOfScores;
    }

    public void calculateSummationOfHoursAndExam(int[] hours, int[] scores) {
        int sum = 0;
        for(int count = 0; count < hours.length; count++){
            sum += hours[count] * scores[count];
        }
        this.summation = sum;
    }

    public int getSummation(){
        return summation;
    }

    public void calculateSquareOfHours(int[] hours) {
        int sum = 0;
        for(int count = 0; count < hours.length; count++){
            sum += hours[count] * hours[count];
        }
        this.sumOfHoursSquare = sum;
    }

    public int getSquareOfHours() {
        return sumOfHoursSquare;
    }

    public int getLengthOfHoursStored(int [] hours){
        return hours.length;
    }

    public void calculateScopeOfEquation(){
        int [] hours = this.hoursOfStudent;
        int length = this.getLengthOfHoursStored(hours);
        int Hours = this.getSumOfHours();
        int Scores = this.getSumOfScores();
        int summation = this.getSummation();
        int square = this.getSquareOfHours();
        double first = ((length * summation) - (Hours * Scores));
        int second = ((length * square) - (Hours * Hours));

        this.slope = first / second;
    }


    public double getScopeOfEquation() {
        return slope;
    }

    public void averageOfHours(int[] hours) {
        int length = getLengthOfHoursStored(hours);
        calculateHours(hours);
        int finalHourCount = this.getSumOfHours();
        this.averageOfHours = (double) finalHourCount / length;
    }


    public double getAverageOfHour() {
        return averageOfHours;
    }

    public void calculateAverageOfScores(int[] scores) {
        int length = getLengthOfHoursStored(scores);
        calculateExamScore(scores);
        int finalHourCount = this.getSumOfScores();
        this.averageOfScores = (double) finalHourCount / length;
    }

    public double getAverageOfScores() {
        return averageOfScores;
    }

    public void calculateIntercept() {
        double aveOfScore = this.getAverageOfScores();
        double aveOfHours = this.getAverageOfHour();
        double scope = this.getScopeOfEquation();
        double sum = aveOfScore - (scope * aveOfHours);
        this.intercept = sum;
    }

    public double getIntercept(){
        return intercept;
    }

    public void calculateFinalCalculation() {
        double scope = this.getScopeOfEquation();
        double intercept = this.getIntercept();
        this.finalCalculation = scope + "x" + " " + "+" + " " + intercept;
    }


    public String getFinalCalculation() {
        return finalCalculation;
    }
}

