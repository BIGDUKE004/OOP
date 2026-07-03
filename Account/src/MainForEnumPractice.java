import java.util.Scanner;

public class MainForEnumPractice {

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter color");
        String state = input.nextLine();

        if(state.equalsIgnoreCase("red")){
            System.out.println(EnumPractice.RED);
        }
    }
}
