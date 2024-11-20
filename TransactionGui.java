// import javax.swing.*;
// import java.awt.*;
// import java.util.ArrayList;

// public class TransactionGui extends JFrame {
//     private DefaultListModel<String> transactionListModel = new DefaultListModel<>();
//     private JList<String> transactionList = new JList<>(transactionListModel);

//     public TransactionGui(ArrayList<Transaction> transactions) {
//         setTitle("Transaction Management");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Populate list
//         for (Transaction transaction : transactions) {
//             transactionListModel.addElement(
//                     "Member: " + transaction.getMember().getName() + 
//                     ", Book: " + transaction.getBook().getTitle() + 
//                     ", Borrowed: " + transaction.getBorrowDate() +
//                     ", Returned: " + (transaction.getReturnDate() != null ? transaction.getReturnDate() : "Not Returned")
//             );
//         }

//         add(new JScrollPane(transactionList), BorderLayout.CENTER);

//         JButton btnClose = new JButton("Close");
//         btnClose.addActionListener(e -> dispose());
//         add(btnClose, BorderLayout.SOUTH);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new TransactionGui(new ArrayList<>()).setVisible(true));
//     }
// }
