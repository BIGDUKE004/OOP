import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {

    private LinearRegression model;
    @BeforeEach
    public void setModel(){
        model = new LinearRegression();
    }

    @Test
    public void testThatHoursOfStudiesIsStored(){
        int [] hours = {1, 2, 3, 4, 5};
        model.setHoursOfStudent(hours);
        assertArrayEquals(new int [] {1, 2, 3, 4, 5}, model.getHoursOfStudent());
    }

    @Test
    public void testThatExamsScoresAreScored(){
        int [] scores = {50, 55, 65, 70, 80};
        model.setExamScores(scores);
        assertArrayEquals(new int [] {50, 55, 65, 70, 80}, model.getScores());
    }

    @Test
    public void testThatCalculatedDataPointOf_Hour_IsCorrect(){
        int [] hours = {1, 2, 3, 4, 5};
        model.calculateHours(hours);
        assertEquals(15, model.getSumOfHours());
    }

    @Test
    public void testThatCalculatedDataPointOf_ExamScores_IsCorrect(){
        int [] scores = {50, 55, 65, 70, 80};
        model.calculateExamScore(scores);
        assertEquals(320, model.getSumOfScores());
    }

    @Test
    public void testThatCalculatedDataPointOf_HourAndExamScore_IsCorrect(){
        int [] hours = {1, 2, 3, 4, 5};
        int [] scores = {50, 55, 65, 70, 80};
        model.calculateSummationOfHoursAndExam(hours, scores);
        assertEquals(1035, model.getSummation());
    }

    @Test
    public void testThatCalculatedDataPointOf_HoursSquare_IsCorrect(){
        int [] hours = {1, 2, 3, 4, 5};
        model.calculateSquareOfHours(hours);
        assertEquals(55, model.getSquareOfHours());
    }

    @Test
    public void testThatCalculatedDataPointOfScopeIsCorrect(){
        int[] hours = {1, 2, 3, 4, 5};
        int[] scores = {50, 55, 65, 70, 80};
        model.setHoursOfStudent(hours);
        model.setExamScores(scores);
        model.calculateHours(hours);
        model.calculateExamScore(scores);
        model.calculateSummationOfHoursAndExam(hours, scores);
        model.calculateSquareOfHours(hours);
        model.calculateScopeOfEquation();
        assertEquals(7.5, model.getScopeOfEquation());
    }

    @Test
    public void testThatTheCalculatedAverageOfHoursIsCorrect(){
        int[] hours = {1, 2, 3, 4, 5};
        model.getLengthOfHoursStored(hours);
        model.averageOfHours(hours);
        assertEquals(3, model.getAverageOfHour());
    }

    @Test
    public void testThatTheCalculatedAverageOfScoresIsCorrect(){
        int [] scores = {50, 55, 65, 70, 80};
        model.getLengthOfHoursStored(scores);
        model.calculateAverageOfScores(scores);
        assertEquals(64, model.getAverageOfScores());
    }

    @Test
    public void testThatResultOfInterceptIsCorrect(){
        int[] hours = {1, 2, 3, 4, 5};
        int[] scores = {50, 55, 65, 70, 80};
        model.setHoursOfStudent(hours);
        model.setExamScores(scores);
        model.calculateHours(hours);
        model.calculateExamScore(scores);
        model.calculateSummationOfHoursAndExam(hours, scores);
        model.calculateSquareOfHours(hours);
        model.calculateScopeOfEquation();
        model.averageOfHours(hours);
        model.calculateAverageOfScores(scores);
        model.calculateIntercept();
        assertEquals(41.5, model.getIntercept());
    }

    @Test
    public void testForFinalEquation(){
        int[] hours = {1, 2, 3, 4, 5};
        int[] scores = {50, 55, 65, 70, 80};
        model.setHoursOfStudent(hours);
        model.setExamScores(scores);
        model.calculateHours(hours);
        model.calculateExamScore(scores);
        model.calculateSummationOfHoursAndExam(hours, scores);
        model.calculateSquareOfHours(hours);
        model.calculateScopeOfEquation();
        model.averageOfHours(hours);
        model.calculateAverageOfScores(scores);
        model.calculateIntercept();
        model.calculateFinalCalculation();
        String finalResult = "7.5x + 41.5";
        assertEquals(finalResult, model.getFinalCalculation());
    }
}
