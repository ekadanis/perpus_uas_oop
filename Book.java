public class Book {
    private String title;
    private Author author; 
    private boolean isBorrowed;
    private Member borrower;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void showBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
        System.out.println();  // Memberikan jarak antar buku
    }

    public Member getBorrower() {
        return borrower;
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }
}
