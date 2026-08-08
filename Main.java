public class Main {

    public static void main(String[] args) {

        int[] grades = {95, 78, 88, 62, 100, 45, 83, 71, 59, 90};

        System.out.println("====================================");
        System.out.println("    STUDENT GRADE ANALYZER");
        System.out.println("====================================");

        displayGrades(grades);

        int highest = findHighest(grades);
        System.out.println("\nHighest Grade: " + highest);

        System.out.println("\nStudent Results:");
        checkPassFail(grades);

    }

    public static void displayGrades(int[] grades) {

        System.out.print("Grades: ");

        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println();
    }

    public static int findHighest(int[] grades) {

        int highest = grades[0];

        for (int grade : grades) {

            if (grade > highest) {
                highest = grade;
            }

        }

        return highest;
    }

    public static void checkPassFail(int[] grades) {

        for (int grade : grades) {

            if (grade >= 75) {
                System.out.println(grade + " - PASSED");
            } else {
                System.out.println(grade + " - FAILED");
            }

        }

    }

}