import javax.swing.*;

public class AddMemberFrame extends JFrame {
    public AddMemberFrame() {
        setTitle("Tambah Anggota");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Nama:");
        JLabel streetLabel = new JLabel("Jalan:");
        JLabel cityLabel = new JLabel("Kota:");
        JLabel postalCodeLabel = new JLabel("Kode Pos:");
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField streetField = new JTextField();
        JTextField cityField = new JTextField();
        JTextField postalCodeField = new JTextField();
        JButton addButton = new JButton("Tambahkan");

        // Set bounds
        idLabel.setBounds(50, 30, 100, 30);
        nameLabel.setBounds(50, 70, 100, 30);
        streetLabel.setBounds(50, 110, 100, 30);
        cityLabel.setBounds(50, 150, 100, 30);
        postalCodeLabel.setBounds(50, 190, 100, 30);
        idField.setBounds(150, 30, 200, 30);
        nameField.setBounds(150, 70, 200, 30);
        streetField.setBounds(150, 110, 200, 30);
        cityField.setBounds(150, 150, 200, 30);
        postalCodeField.setBounds(150, 190, 200, 30);
        addButton.setBounds(150, 230, 100, 30);

        // Add action listener
        addButton.addActionListener(e -> {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            String street = streetField.getText().trim();
            String city = cityField.getText().trim();
            String postalCode = postalCodeField.getText().trim();

            if (id.isEmpty() || name.isEmpty() || street.isEmpty() || city.isEmpty() || postalCode.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Anggota berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                // Tambahkan logika untuk menyimpan anggota di sini
                dispose();
            }
        });

        // Add components to frame
        add(idLabel);
        add(nameLabel);
        add(streetLabel);
        add(cityLabel);
        add(postalCodeLabel);
        add(idField);
        add(nameField);
        add(streetField);
        add(cityField);
        add(postalCodeField);
        add(addButton);

        setVisible(true);
    }
}
