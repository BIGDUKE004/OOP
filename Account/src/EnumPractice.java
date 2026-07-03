//Create an enum for traffic lights (RED, YELLOW, GREEN). Write a program that displays the action associated with each light.
public enum EnumPractice {
    RED ("Stop"),
    YELLOW ("Get Ready"),
    GREEN ("Go");

    private String state; // wanna use this to find what the user has entered

    EnumPractice(String state){ // this is the user input
        this.state = state; // assigning the value of the user input to the state
    }

    public String getMessage(){
        return state; // get what the user has found inside the enums
    }
}
