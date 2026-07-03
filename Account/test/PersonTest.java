import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testThatICanAddProblem(){
        Person person = new Person();
        Problem problem = new Problem(
                "School Fees",
                "Need money",
                ProblemType.FINANCIAL
        );

        person.addProblem(problem);

        assertEquals(1, person.countProblem());

    }
}
