import javax.swing.*;

public class ReturnBookFrame extends JFrame {
    public ReturnBookFrame() {
        setTitle("Kembalikan Buku");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel memberLabel = new JLabel("Pilih Anggota:");
        JComboBox<String> memberDropdown = new JComboBox<>(new String[]{"Anggota 1", "Anggota 2", "Anggota 3"}); // Tambahkan data anggota dari database
        JLabel borrowedBooksLabel = new JLabel("Buku yang Dipinjam:");
        JComboBox<String> borrowedBooksDropdown = new JComboBox<>(new String[]{"Buku 1", "Buku 2", "Buku 3"}); // Tambahkan data buku yang dipinjam
        JButton returnButton = new JButton("Kembalikan");

        // Set bounds
        memberLabel.setBounds(50, 50, 100, 30);
        memberDropdown.setBounds(150, 50, 200, 30);
        borrowedBooksLabel.setBounds(50, 100, 150, 30);
        borrowedBooksDropdown.setBounds(150, 100, 200, 30);
        returnButton.setBounds(150, 150, 100, 30);

        // Add action listener
        returnButton.addActionListener(e -> {
            String selectedMember = (String) memberDropdown.getSelectedItem();
            String selectedBook = (String) borrowedBooksDropdown.getSelectedItem();

            if (selectedMember == null || selectedBook == null) {
                JOptionPane.showMessageDialog(this, "Harap pilih anggota dan buku!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Buku berhasil dikembalikan oleh " + selectedMember, "Sukses", JOptionPane.INFORMATION_MESSAGE);
                // Tambahkan logika untuk menyimpan transaksi pengembalian di sini
                dispose();
            }
        });

        // Add components to frame
        add(memberLabel);
        add(memberDropdown);
        add(borrowedBooksLabel);
        add(borrowedBooksDropdown);
        add(returnButton);

        setVisible(true);
    }
}
