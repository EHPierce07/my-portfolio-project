public class SchoolSubjects {
    public static void main(String[] args) {

        String grade[] = { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" };

        String subjects[][] = {
            {"Mother Tongue", "Filipino"},              // Grade 1
            {"ESP", "English"},                         // Grade 2
            {"Araling Panlipunan", "MAPEH"},            // Grade 3
            {"Science", "EPP"},                         // Grade 4
            {"Math", "TLE"}                             // Grade 5
        };

        
        System.out.println("x: School Subjects");

        // System.out.println("Grade: " + grade[3]);
        // System.out.println("Subjects: " + grade[3] + " " + subjects[3][1]);

        
        for (int i = 0; i < grade.length; i++) {
            System.out.println("Grade = " + grade[i]);
            for (String subject : subjects[i]) {
                System.out.print("Subject " + subject + ", ");
            }
            System.out.println(); // Print a new line after each grade
        }
    }
}