import java.util.Arrays;
import java.util.ArrayList;

public class AdventDay {
    private int[] position;
    private ArrayList<Integer> possibilities = new ArrayList<Integer>();
    private int repeated;

    public AdventDay(int[] data){
        position = data;
        repeated = -1;
    }

    // Part 1 - - -- -
    // THIS METHOD SHOULD RECEIVE THE NUMBER THAT GETS REPEATED THE MOST!
    // STILL IN PROGRESS - - - - -
    public int getRepeats(){
        for (int i = 0; i < position.length; i++){
            for (int j = 0; j < possibilities.size(); j++) {
                if (position[i] != possibilities.get(j)) {
                    possibilities.add(position[i]);
                } else if (position[i] == possibilities.get(j)){
                    repeated = possibilities.get(j);
                }
            }
        }
        return repeated;
    }

    // Part 2 - - - -- -
    // THIS METHOD SHOULD FIND THE DIFFERENCE BETWEEN THE REPEATED NUMBER
    // AND EVERY OTHER NUMBER IN THE LIST, THEN ADD THE DIFFERENCE AND RETURN IT
    public int fuel(){
        int leastFuel = 0;
        for (int i = 0; i < position.length; i++){
            leastFuel += Math.abs(position[i] - repeated);
        }

        return leastFuel;
    }
}
