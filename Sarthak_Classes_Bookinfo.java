public class Sarthak_Classes_Bookinfo {
    //Create a class called Book to represent a book. A Book should include four pieces of information as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class should have a constructor that initializes the four instance variables. Provide a mutator method and accessor method (query method) for each instance variable. In addition, provide a method named getBookInfo that returns the description of the book as a String (the description should include all the information about the book). You should use this keyword in member methods and constructor. 
//Write a test application named BookTest to create an array of object for 30 elements for class Book to demonstrate the class Book's capabilities
    private String bookName;
    private String ISBN;
    private String authorName;
    private String publisher;

    public Sarthak_Classes_Bookinfo(String bookName, String ISBN, String authorName, String publisher) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName != null) {
            this.bookName = bookName;
        } else {
            this.bookName = "Unknown";
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN != null) {
            this.ISBN = ISBN;
        } else {
            this.ISBN = "Unknown";
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName != null) {
            this.authorName = authorName;
        } else {
            this.authorName = "Unknown";
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null) {
            this.publisher = publisher;
        } else {
            this.publisher = "Unknown";
        }
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + "\nISBN: " + ISBN + "\nAuthor Name: " + authorName + "\nPublisher: " + publisher;
    }

    public static void main(String args[]) {
        Sarthak_Classes_Bookinfo[] books = new Sarthak_Classes_Bookinfo[30];
        books[0] = new Sarthak_Classes_Bookinfo("Book1", "1234", "Author1", "Publisher1");
        books[1] = new Sarthak_Classes_Bookinfo("Book2", "1235", "Author2", "Publisher2");
        books[2] = new Sarthak_Classes_Bookinfo("Book3", "1236", "Author3", "Publisher3");
        books[3] = new Sarthak_Classes_Bookinfo("Book4", "1237", "Author4", "Publisher4");

}
}
