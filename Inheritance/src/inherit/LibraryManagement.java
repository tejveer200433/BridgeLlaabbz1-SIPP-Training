package inherit;


class Book {
 String title;
 int publicationYear;

 public Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 public void displayInfo() {
     System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
 }
}

class Author extends Book {
 String name;
 String bio;

 public Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);
     this.name = name;
     this.bio = bio;
 }


 public void displayInfo() {
     super.displayInfo();
     System.out.println("Author Name: " + name + ", Bio: " + bio);
 }
}

public class LibraryManagement {
 public static void main(String[] args) {
     Author authorBook = new Author("The Great Novel", 2020, "Jane Doe", "A prolific writer.");
     System.out.println("--- Library Management with Books and Authors ---");
     authorBook.displayInfo();
 }
}