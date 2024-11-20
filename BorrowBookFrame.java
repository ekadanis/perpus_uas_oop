import javax.swing.*;
import java.util.ArrayList;

public class BorrowBookFrame extends JFrame {
    public BorrowBookFrame(){}
    public BorrowBookFrame(Library library) {
        setTitle("Pinjam Buku");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel memberLabel = new JLabel("Pilih Anggota:");
        JLabel bookLabel = new JLabel("Pilih Buku:");
        JComboBox<String> memberDropdown = new JComboBox<>(library.getMemberNames().toArray(new String[0]));
        JComboBox<String> bookDropdown = new JComboBox<>(library.getBookTitles().toArray(new String[0]));
        JButton borrowButton = new JButton("Pinjam");

        // Set bounds
        memberLabel.setBounds(50, 50, 100, 30);
        bookLabel.setBounds(50, 100, 100, 30);
        memberDropdown.setBounds(150, 50, 200, 30);
        bookDropdown.setBounds(150, 100, 200, 30);
        borrowButton.setBounds(150, 150, 100, 30);

        // Add action listener
        borrowButton.addActionListener(e -> {
            String selectedMember = (String) memberDropdown.getSelectedItem();
            String selectedBook = (String) bookDropdown.getSelectedItem();

            if (selectedMember == null || selectedBook == null) {
                JOptionPane.showMessageDialog(this, "Harap pilih anggota dan buku!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Update the borrowing logic
                Book bookToBorrow = library.getBooks().stream()
                        .filter(book -> book.getTitle().equals(selectedBook))
                        .findFirst()
                        .orElse(null);

                Member borrowingMember = library.getMembers().stream()
                        .filter(member -> member.getName().equals(selectedMember))
                        .findFirst()
                        .orElse(null);

                if (bookToBorrow != null && borrowingMember != null && !bookToBorrow.isBorrowed()) {
                    bookToBorrow.setBorrowed(true);
                    bookToBorrow.setBorrower(borrowingMember);
                    JOptionPane.showMessageDialog(this, "Buku berhasil dipinjam oleh " + selectedMember, "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Buku sudah dipinjam atau anggota tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                dispose();
            }
        });

        // Add components to frame
        add(memberLabel);
        add(bookLabel);
        add(memberDropdown);
        add(bookDropdown);
        add(borrowButton);

        setVisible(true);
    }
}
