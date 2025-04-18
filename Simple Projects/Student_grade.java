import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n                Student Grade                 ");
        System.out.println("              Calculator Program              ");
        System.out.println("----------------------------------------------");

        System.out.println("Enter no of subject");
        int n = sc.nextInt();

        int theMarks[] = new int[n];
        String Grades[] = new String[n];

        int total = 0;
        System.out.println("Enter the Marks of: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            int marks = sc.nextInt();
            total += marks;

            if (marks < 0 || marks > 100) {

                System.out.println("Invalid Marks : Enter Marks in the Range 0-100\n");
                i--;

            } else {

                theMarks[i] = marks;

                switch (marks / 10) {
                    case 9:
                        Grades[i] = "A+";
                        break;
                    case 8:
                        Grades[i] = "A";
                        break;
                    case 7:
                        Grades[i] = "B+";
                        break;
                    case 6:
                        Grades[i] = "B";
                        break;
                    case 5:
                        Grades[i] = "C+";
                        break;
                    case 4:
                        Grades[i] = "C";
                        break;
                    default:
                        Grades[i] = "D";
                        break;

                }

            }
        }

        System.out.println(" ---------------------------------------------");
        System.out.println("|         Marks      |     Grade              |");
        System.out.println(" ---------------------------------------------");

        for (int i = 0; i < theMarks.length; i++)
            System.out.println("|          " + theMarks[i] + "        |       " + Grades[i]);
        
        System.out.println(" ---------------------------------------------");

        double averp = (double) total / n;
        String grade;

        if (averp >= 90) {
            grade = "A+";
        } 
        else if (averp >= 80) {
            grade = "A";
        } 
        else if (averp >= 70) {
            grade = "B+";
        }
        else if (averp >= 60) {
            grade = "B";
        }
        else if (averp >= 50) {
            grade = "C+";
        }
        else if (averp >= 40) {
            grade = "C";
        }
        else {
            grade = "fail";
        }

        System.out.println("Total marks scored is : " + total);
        System.out.println("Avrage percentage Gained is: " + averp + "%");
        System.out.println("Grade : " + grade);
        System.out.println("----------------------------------------------");

        sc.close();
    }
}