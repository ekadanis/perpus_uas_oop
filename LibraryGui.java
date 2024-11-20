// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class LibraryGui {
//     private Library library;
//     private JFrame frame;

//     public LibraryGui() {
//         library = new Library();
//         frame = new JFrame("Library Management System");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(600, 400);
//         frame.setLayout(new GridLayout(4, 2, 10, 10));

//         // Main Menu Buttons
//         JButton addBookButton = new JButton("Tambah Buku");
//         JButton addMemberButton = new JButton("Tambah Anggota");
//         JButton borrowBookButton = new JButton("Pinjam Buku");
//         JButton returnBookButton = new JButton("Kembalikan Buku");
//         JButton listBooksButton = new JButton("Daftar Buku yang Tersedia");
//         JButton listMembersButton = new JButton("Daftar Anggota");
//         JButton exitButton = new JButton("Keluar");

//         frame.add(addBookButton);
//         frame.add(addMemberButton);
//         frame.add(borrowBookButton);
//         frame.add(returnBookButton);
//         frame.add(listBooksButton);
//         frame.add(listMembersButton);
//         frame.add(exitButton);

//         // Button Listeners
//         addBookButton.addActionListener(e -> showAddBookForm());
//         addMemberButton.addActionListener(e -> showAddMemberForm());
//         borrowBookButton.addActionListener(e -> showBorrowBookForm());
//         returnBookButton.addActionListener(e -> showReturnBookForm());
//         listBooksButton.addActionListener(e -> displayAvailableBooks());
//         listMembersButton.addActionListener(e -> displayMembers());
//         exitButton.addActionListener(e -> System.exit(0));

//         frame.setVisible(true);
//     }

//     private void showAddBookForm() {
//         JFrame addBookFrame = new JFrame("Tambah Buku");
//         addBookFrame.setSize(400, 300);
//         addBookFrame.setLayout(new GridLayout(4, 2));

//         JTextField titleField = new JTextField();
//         JTextField authorField = new JTextField();
//         JTextField publisherField = new JTextField();

//         JButton addButton = new JButton("Tambahkan");

//         addBookFrame.add(new JLabel("Judul Buku:"));
//         addBookFrame.add(titleField);
//         addBookFrame.add(new JLabel("Nama Penulis:"));
//         addBookFrame.add(authorField);
//         addBookFrame.add(new JLabel("Penerbit:"));
//         addBookFrame.add(publisherField);
//         addBookFrame.add(new JLabel());
//         addBookFrame.add(addButton);

//         addButton.addActionListener(e -> {
//             String title = titleField.getText().trim();
//             String author = authorField.getText().trim();
//             String publisher = publisherField.getText().trim();

//             if (title.isEmpty()) {
//                 JOptionPane.showMessageDialog(addBookFrame, "Judul buku tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//             } else {
//                 library.addBook(new Book(title, author, publisher));
//                 JOptionPane.showMessageDialog(addBookFrame, "Buku berhasil ditambahkan!");
//                 addBookFrame.dispose();
//             }
//         });

//         addBookFrame.setVisible(true);
//     }

//     // Implementasi untuk form lainnya (Tambah Anggota, Pinjam Buku, dll.)
// }
