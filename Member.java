import java.util.ArrayList;

public class Member {
    private String id;
    private String name;
    private Address address;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Member(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public Book findBorrowedBookByTitle(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayDetailMember(){
        System.out.println("ID : " + id);
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address.getStreet() +" "+ address.getCity() +" " + address.getPostalCode());
    }

    
    private void displayAllMembers() {
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }

    @Override
    public String toString() {
    return "ID: " + id +
           ", Nama: " + name +
           ", Alamat: " +  address.toString();
}

    
}
