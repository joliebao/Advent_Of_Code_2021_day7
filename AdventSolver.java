import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AdventSolver {
    public static void main(String[] args) {
        int[] fileData = getFileData("src/InputFile");
        AdventDay a = new AdventDay(fileData);
        a.getMedian();
        System.out.println(a.fuel());
        System.out.println(a.difficultFuel());
    }

    public static int[] getFileData(String fileName) {
        int[] fileDataInt = new int[1000];
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String[] fileData = (s.nextLine()).split(",");
                for (int i = 0; i < fileData.length; i++){
                    fileDataInt[i] = Integer.parseInt(fileData[i]);
                }
            }
            return fileDataInt;
        }
        catch (FileNotFoundException e) {
            return fileDataInt;
        }
    }
}