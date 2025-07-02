package inherit;


class Course {
 String courseName;
 String duration;

 public Course(String courseName, String duration) {
     this.courseName = courseName;
     this.duration = duration;
 }
}

class OnlineCourse extends Course {
 String platform;
 boolean isRecorded;

 public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }
}

class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount;

 public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }
}

public class CourseHierarchy {
 public static void main(String[] args) {
     PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", "40 hours", "Coursera", true, 99.99, 10.00);
     System.out.println("--- Educational Course Hierarchy ---");
     System.out.println("Course: " + paidCourse.courseName + ", Platform: " + paidCourse.platform + ", Fee: $" + paidCourse.fee + ", Discount: $" + paidCourse.discount);
 }
}