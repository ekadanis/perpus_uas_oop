// import java.time.LocalDate;

// public class Transaction {
//     private Member member;  // Association dengan Member
//     private Book book;  // Association dengan Book
//     private LocalDate borrowDate;
//     private LocalDate returnDate;

//     public Transaction(Member member, Book book, LocalDate borrowDate, LocalDate returnDate) {
//         this.member = member;
//         this.book = book;
//         this.borrowDate = borrowDate;
//         this.returnDate = returnDate;
//     }

//     // Getter and Setter
//     public Member getMember() {
//         return member;
//     }

//     public void setMember(Member member) {
//         this.member = member;
//     }

//     public Book getBook() {
//         return book;
//     }

//     public void setBook(Book book) {
//         this.book = book;
//     }

//     public LocalDate getBorrowDate() {
//         return borrowDate;
//     }

//     public void setBorrowDate(LocalDate borrowDate) {
//         this.borrowDate = borrowDate;
//     }

//     public LocalDate getReturnDate() {
//         return returnDate;
//     }

//     public void setReturnDate(LocalDate returnDate) {
//         this.returnDate = returnDate;
//     }

//     @Override
//     public String toString() {
//         return "Transaction[Member: " + member.getName() + ", Book: " + book + ", Borrow Date: " + borrowDate + ", Return Date: " + returnDate + "]";
//     }
// }
