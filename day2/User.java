
import java.util.ArrayList;
import java.util.List;

// Base class
class User {
    private String username;
    private String password;
    private String role; // "student" or "admin"

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

// Subclass
class Student extends User {
    private boolean isEnrolled;

    public Student(String username, String password, boolean isEnrolled) {
        super(username, password, "student");
        this.isEnrolled = isEnrolled;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        if (super.login(inputUsername, inputPassword)) {
            if (isEnrolled) {
                System.out.println("Student login successful. Showing available exams...");
                return true;
            } else {
                System.out.println("Login successful, but you are not enrolled in any course.");
                return false;
            }
        }
        System.out.println("Invalid student credentials.");
        return false;
    }
}

// Subclass
class Admin extends User {
    private boolean hasAdminPrivileges;

    public Admin(String username, String password, boolean hasAdminPrivileges) {
        super(username, password, "admin");
        this.hasAdminPrivileges = hasAdminPrivileges;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        if (super.login(inputUsername, inputPassword)) {
            if (hasAdminPrivileges) {
                System.out.println("Admin login successful. Accessing exam management tools...");
                return true;
            } else {
                System.out.println("Login successful, but you do not have admin privileges.");
                return false;
            }
        }
        System.out.println("Invalid admin credentials.");
        return false;
    }
}

public class OnlineExamPortal {
    public static void main(String[] args) {
        User student = new Student("john123", "pass123", true);
        User admin = new Admin("admin1", "adminpass", true);
        User unregisteredStudent = new Student("lisa456", "pass456", false);

        student.login("john123", "pass123");
        admin.login("admin1", "adminpass");
        unregisteredStudent.login("lisa456", "pass456");
        student.login("wronguser", "wrongpass");
    }
}