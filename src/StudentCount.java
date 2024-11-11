import java.util.Scanner;

public class StudentCount {
    private int[] marks;
    private int countAbove50;


    public StudentCount(int numStudents) {
        marks = new int[numStudents];
        countAbove50 = 0;
    }


    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void findHighestLowest() {
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];

            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
    }


    public void countAndDisplay() {
        double totalResult=0;
        for (int i=0;i<marks.length;i++){
            if (marks[i]>50){
                countAbove50++;
                totalResult+=marks[i];
            }

        }
        System.out.println("Number of students who obtained marks above 50%: " + countAbove50);
        System.out.println("Marks of students who obtained marks above 50%:"+totalResult);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 50) {
                System.out.println("Student " + (i + 1) + ": " + marks[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();


        StudentCount studentCount = new StudentCount(numStudents);


        studentCount.readMarks();
        studentCount.findHighestLowest();
        studentCount.countAndDisplay();
    }
}