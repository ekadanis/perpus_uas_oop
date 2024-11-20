// import javax.swing.*;
// import java.awt.*;
// import java.util.ArrayList;

// public class BookGui extends JFrame {
//     private DefaultListModel<String> bookListModel = new DefaultListModel<>();
//     private JList<String> bookList = new JList<>(bookListModel);

//     public BookGui(ArrayList<Book> books) {
//         setTitle("Book Management");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Populate list
//         for (Book book : books) {
//             bookListModel.addElement(book.getTitle());
//         }

//         add(new JScrollPane(bookList), BorderLayout.CENTER);

//         JButton btnClose = new JButton("Close");
//         btnClose.addActionListener(e -> dispose());
//         add(btnClose, BorderLayout.SOUTH);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new BookGui(new ArrayList<>()).setVisible(true));
//     }
// }
