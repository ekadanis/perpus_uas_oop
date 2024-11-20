import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListBooksFrame extends JFrame {
    public ListBooksFrame (){}
    public ListBooksFrame(Library library) {
        setTitle("Daftar Buku Tersedia");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JTextArea bookListArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bookListArea);
        scrollPane.setBounds(50, 50, 300, 200);

        // Ambil data buku dari library
        StringBuilder bookData = new StringBuilder();
        for (Book book : library.getBooks()) {
            bookData.append(book.getTitle())
                    .append(" - ")
                    .append(book.isBorrowed() ? "Dipinjam oleh " + book.getBorrower().getName() : "Tersedia")
                    .append("\n");
        }
        bookListArea.setText(bookData.toString());
        bookListArea.setEditable(false);

        add(scrollPane);
        setVisible(true);
    }
}
