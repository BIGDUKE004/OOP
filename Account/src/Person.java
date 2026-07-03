import java.util.ArrayList;

public class Person {
    private ArrayList <Problem> list = new ArrayList<>();

    public void addProblem (Problem problem){
        list.add(problem);
    }

    public void solveProblem (String name, String description, ProblemType type){
        for(int count = 0; count < list.size(); count++){
            if(list.get(count).getName().equals(name)){
                list.get(count).setStatus(true);
            }
        }
    }

    public int countProblem(){
        return list.size();
    }
}
