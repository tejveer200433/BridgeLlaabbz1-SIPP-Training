public class AttendanceMarker {
    public static void main(String[] args) {
        int students = 30;
        int days = 30;
        int[][] attendance = new int[students][days];

        // Example data for 5 students over 5 days
        int[][] sampleAttendance = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        // Mark attendance: Student 1 (index 0), Day 1 (index 0) = Present(1)
        // Student 3 (index 2), Day 1 (index 0) = Absent(0)
        attendance[0][0] = 1;
        attendance[2][0] = 0;

        // Daily Summary: Count present students on Day 10 (index 9)
        int day = 9;
        int presentCount = 0;
        for (int i = 0; i < students; i++) {
            if (attendance[i][day] == 1) {
                presentCount++;
            }
        }
        System.out.println("Students present on Day " + (day + 1) + ": " + presentCount);

        // Monthly Summary: Count total days present for Student 5 (index 4)
        int student = 4;
        int totalPresent = 0;
        for (int i = 0; i < days; i++) {
            totalPresent += sampleAttendance[student][i];
        }
        System.out.println("Student " + (student + 1) + " attended " + totalPresent + " days.");

        // Defaulter list: Students with < 75% attendance
        double attendanceThreshold = days * 0.75;
        System.out.println("\nStudents with attendance below 75%:");
        for (int i = 0; i < sampleAttendance.length; i++) {
            int daysPresent = 0;
            for (int j = 0; j < sampleAttendance[i].length; j++) {
                daysPresent += sampleAttendance[i][j];
            }
            if (daysPresent < attendanceThreshold) {
                System.out.println("Student " + (i + 1) + " attended " + daysPresent + " days.");
            }
        }
    }
}
