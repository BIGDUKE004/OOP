public class Problem {
    public String name;
    public String description;
    public ProblemType type;
    public boolean status;

    public Problem (String name, String description, ProblemType type){
        this.name = name;
        this.description = description;
        this.type = type;
        this.status = false;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public ProblemType getType(){
        return this.type;
    }

    public boolean setStatus(boolean stats){
        return this.status = stats;
    }

    public boolean getStatus(){
        return this.status;
    }

}
