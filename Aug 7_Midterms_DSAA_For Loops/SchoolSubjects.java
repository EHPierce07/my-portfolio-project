public class SchoolSubjects {
    public static void main(String[] args) {

        String grade[] = { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" };

        String subjects[][] = {
            {"Mother Tongue", "Filipino"},
            {"ESP", "English"},
            {"Araling Panlipunan", "MAPEH"},
            {"Science", "EPP"},
            {"Math", "TLE"}
        };


        System.out.println("x: School Subjects");
        
        for (int i = 0; i < grade.length; i++) {
            System.out.println("Grade = " + grade[i]);
            for (String subject : subjects[i]) {
                System.out.print("Subject " + subject + ", ");
            }
            System.out.println();
        }
    }
}