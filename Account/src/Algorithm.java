import java.util.Arrays;

public class Algorithm {
    // put all array at index 0 into the first element and sam for the second
    public static int [][] solveThis(int [][] array){
        int [][] newArray = new int[array.length][2];
        int counter = 0;
        for(int count = 0; count < array.length; count++){
            newArray[counter][count] = array[counter][count];
            counter++;
        }

        return newArray;
    }

    public static void main(String[] args){
        int [][] array = {
                {2, 3},
                {5, 6}
        };
        System.out.print(Arrays.deepToString(Algorithm.solveThis(array)
        ));
    }
}
