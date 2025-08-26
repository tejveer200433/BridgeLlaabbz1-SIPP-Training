package day1;

public class AttendanceMarker {
    public static void main(String[] args) {
        char[][] attendance = new char[30][30];

        // Example data for student 1's first week
        char[] student1Week1 = {'P', 'P', 'A', 'P', 'P', 'P', 'A'};
        for (int i = 0; i < student1Week1.length; i++) {
            attendance[0][i] = student1Week1[i];
        }

        System.out.println("Student 1, Day 3 attendance was: " + attendance[0][2]);
        attendance[0][2] = 'P';
        System.out.println("Student 1, Day 3 attendance updated to: " + attendance[0][2]);

        int studentRow = 0;
        int presentCount = 0;
        for (int i = 0; i < 30; i++) {
            if (attendance[studentRow][i] == 'P') {
                presentCount++;
            }
        }
        System.out.println("Student " + (studentRow + 1) + " was present for " + presentCount + " days.");
    }
}