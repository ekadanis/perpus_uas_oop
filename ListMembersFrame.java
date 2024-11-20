import javax.swing.*;

public class ListMembersFrame extends JFrame {
    public ListMembersFrame() {
        setTitle("Daftar Anggota");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JTextArea memberListArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(memberListArea);
        scrollPane.setBounds(50, 50, 300, 200);

        // Tambahkan data anggota dari database
        memberListArea.setText("1. ID: 1, Nama: Anggota A, Alamat: Jalan A\n" +
                "2. ID: 2, Nama: Anggota B, Alamat: Jalan B\n" +
                "3. ID: 3, Nama: Anggota C, Alamat: Jalan C");
        memberListArea.setEditable(false);

        add(scrollPane);

        setVisible(true);
    }
}
