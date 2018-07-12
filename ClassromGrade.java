import java.util.ArrayList;

/**
 * I create a simple tool to help analyze classroom grades storedin an
 * ArrayList.
 */
public class GradeAnalyzer {
    public GradeAnalyzer() {

    }

    public int getAverage(ArrayList<Integer> grades) {
        if (grades.size() < 1) {
            System.out.println("Error");
            return 0;
        } else {
            int sum = 0;
            for (Integer grade : grades) {
                sum = sum + grade;
            } 

            int average = sum / grades.size();
            System.out.println(average);
            return average;

        } 
    }

    public static void main(String[] args) {

        ArrayList<Integer> myClassrom = new ArrayList<Integer>();
        myClassrom.add(98);
        myClassrom.add(92);
        myClassrom.add(88);
        myClassrom.add(75);
        myClassrom.add(61);
        myClassrom.add(89);
        myClassrom.add(95);

        GradeAnalyzer myAnalyzer = new GradeAnalyzer();

        myAnalyzer.getAverage(myClassrom);
    }
}

/**
 * Output: 85
 */