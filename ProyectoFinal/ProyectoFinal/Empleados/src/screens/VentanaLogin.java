package screens;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import db.repositorys.LoginRepository;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame implements ActionListener {

    private LoginRepository loginRepository;
    private JLabel textJLabel;
    private JLabel usuarioJLabel;
    private JTextField usuarioJTextField;
    private JLabel contraseniaJLabel;
    private JPasswordField contraseniaJPasswordField;
    private JButton iniciarJButton;
    private JButton registrarJButton;

    public VentanaLogin() {
        super("Inicia sesion");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        loginRepository = new LoginRepository();
        crearComponentes();
    }

    private void crearComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        textJLabel = new JLabel("Iniciar sesión");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textJLabel, gbc);

        usuarioJLabel = new JLabel("Usuario:");
        usuarioJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(usuarioJLabel, gbc);

        usuarioJTextField = new JTextField(100);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(usuarioJTextField, gbc);

        contraseniaJLabel = new JLabel("Contraseña:");
        contraseniaJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(contraseniaJLabel, gbc);

        contraseniaJPasswordField = new JPasswordField(100);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(contraseniaJPasswordField, gbc);

        iniciarJButton = new JButton("Iniciar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        iniciarJButton.addActionListener(this);
        add(iniciarJButton, gbc);

        registrarJButton = new JButton("Registrarse");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        registrarJButton.addActionListener(this);
        add(registrarJButton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciarJButton) {
            if (!loginRepository.iniciarSesion(usuarioJTextField.getText(), damePassword())) {
                mensajePassword();
                return;
            }
            VentanaEmpleados ve = new VentanaEmpleados();
            ve.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == registrarJButton) {
            this.dispose();
            VentanaRegistro ve = new VentanaRegistro();
            ve.setVisible(true);
        }
    }

    private void mensajePassword() {
        JOptionPane.showConfirmDialog(null,
                "El usuario o contraseña no son correctos",
                "Error",
                JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private String damePassword() {
        char[] passwordChars = contraseniaJPasswordField.getPassword();
        String password = new String(passwordChars);
        return password;
    }

}







