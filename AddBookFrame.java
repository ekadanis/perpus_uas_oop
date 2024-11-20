import javax.swing.*;

public class AddBookFrame extends JFrame {
    private Library library;  // Tambahkan Library sebagai parameter

    public AddBookFrame() {
        this.library = library; // Inisialisasi library
        setTitle("Tambah Buku");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Judul Buku:");
        JLabel authorLabel = new JLabel("Nama Penulis:");
        JLabel publisherLabel = new JLabel("Penerbit:");
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField publisherField = new JTextField();
        JButton addButton = new JButton("Tambahkan");

        // Set bounds
        titleLabel.setBounds(50, 30, 100, 30);
        authorLabel.setBounds(50, 70, 100, 30);
        publisherLabel.setBounds(50, 110, 100, 30);
        titleField.setBounds(150, 30, 200, 30);
        authorField.setBounds(150, 70, 200, 30);
        publisherField.setBounds(150, 110, 200, 30);
        addButton.setBounds(0, 170, 200, 30);

        // Add action listener
        addButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            String authorName = authorField.getText().trim();
            String publisher = publisherField.getText().trim();

            if (title.isEmpty() || authorName.isEmpty() || publisher.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Buat objek Author dan Book baru
                Author author = new Author(authorName, "Bio");  // Ganti dengan bio yang sesuai
                Book newBook = new Book(title, author);
                library.addBook(newBook);  // Menambahkan buku ke library
                
                JOptionPane.showMessageDialog(this, "Buku berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                dispose();  // Tutup frame setelah menambahkan buku
            }
        });

        // Add components to frame
        add(titleLabel);
        add(authorLabel);
        add(publisherLabel);
        add(titleField);
        add(authorField);
        add(publisherField);
        add(addButton);

        setVisible(true);
    }
}
