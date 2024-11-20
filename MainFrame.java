import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Library Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Buat tombol-tombol
        JButton addBookButton = new JButton("Tambah Buku");
        JButton addMemberButton = new JButton("Tambah Anggota");
        JButton borrowBookButton = new JButton("Pinjam Buku");
        JButton returnBookButton = new JButton("Kembalikan Buku");
        JButton listBooksButton = new JButton("Daftar Buku");
        JButton listMembersButton = new JButton("Daftar Anggota");
        JButton exitButton = new JButton("Keluar");

        // Tambahkan action listeners
        addBookButton.addActionListener(e -> new AddBookFrame());
        addMemberButton.addActionListener(e -> new AddMemberFrame());
        borrowBookButton.addActionListener(e -> new BorrowBookFrame());
        returnBookButton.addActionListener(e -> new ReturnBookFrame());
        listBooksButton.addActionListener(e -> new ListBooksFrame());
        listMembersButton.addActionListener(e -> new ListMembersFrame());
        exitButton.addActionListener(e -> System.exit(0));

        // Tambahkan tombol ke frame
        add(addBookButton);
        add(addMemberButton);
        add(borrowBookButton);
        add(returnBookButton);
        add(listBooksButton);
        add(listMembersButton);
        add(exitButton);

        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
