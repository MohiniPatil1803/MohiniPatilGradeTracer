import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter students' grades (enter -1 to finish):");

        // Loop to input grades
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break; // exit loop when -1 is entered
            }
            grades.add(grade);
        }

        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Find highest and lowest grades
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            int currentGrade = grades.get(i);
            if (currentGrade > highest) {
                highest = currentGrade;
            }
            if (currentGrade < lowest) {
                lowest = currentGrade;
            }
        }

        // Output results
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
