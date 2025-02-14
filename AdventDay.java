import java.util.Arrays;
import java.util.ArrayList;

public class AdventDay {
    private int[] position;
    private int median;

    public AdventDay(int[] data){
        position = data;
        median = -1;
    }

    // Part 1 - - -- -
    // THIS METHOD SHOULD RECEIVE THE NUMBER THAT GETS REPEATED THE MOST!
    // Adner said it should be the median!
    // STILL IN PROGRESS - - - - -
    public int getMedian(){
        Arrays.sort(position);
        median = position[500];
        return median;
    }

    // THIS METHOD SHOULD FIND THE DIFFERENCE BETWEEN THE REPEATED NUMBER
    // AND EVERY OTHER NUMBER IN THE LIST, THEN ADD THE DIFFERENCE AND RETURN IT
    public int fuel(){
        int leastFuel = 0;
        for (int i = 0; i < position.length; i++){
            leastFuel += Math.abs(position[i] - median);
        }
        return leastFuel;
    }

    // Part 2 - - - -- -
    public int difficultFuel(){
        int leastFuelComplicated = 0;
        for (int each : position){
            for (int j = 0; j < Math.abs(each - median); j++) {
                leastFuelComplicated += j;
            }
        }
        return leastFuelComplicated;
    }
}
