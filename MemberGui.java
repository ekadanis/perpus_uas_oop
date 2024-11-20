// import javax.swing.*;
// import java.awt.*;
// import java.util.ArrayList;

// public class MemberGui extends JFrame {
//     private DefaultListModel<String> memberListModel = new DefaultListModel<>();
//     private JList<String> memberList = new JList<>(memberListModel);

//     public MemberGui(ArrayList<Member> members) {
//         setTitle("Member Management");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Populate list
//         for (Member member : members) {
//             memberListModel.addElement(member.toString());
//         }

//         add(new JScrollPane(memberList), BorderLayout.CENTER);

//         JButton btnClose = new JButton("Close");
//         btnClose.addActionListener(e -> dispose());
//         add(btnClose, BorderLayout.SOUTH);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new MemberGui(new ArrayList<>()).setVisible(true));
//     }
// }
