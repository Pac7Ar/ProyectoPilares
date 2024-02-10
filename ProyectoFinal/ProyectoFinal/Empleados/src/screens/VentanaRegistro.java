package screens;

import javax.swing.*;
import java.awt.GridBagCosntraints;

public class VentanaRegistro extends JFrame implemets ActionListener {
    private LoginRespository loginRepository;
    private JLabel textJlabel;
    private JLlabel NombreJlable;
    private JTextField NombreJLabel;
    private JLabel EmailJLabel;
    private JPasswordFiel EmailJPasswordField;
    private JLable Usuario Usuario;
    private JTextField UsuarioJLabel;
    private JLabel contraseniaJLabel;
    private JPasswordField contraseniaJpassword;
    private JButton RegistarteJButton;


    public VentanaRegsitro(){
        super("Registrase");
        this.setSize(300,600);
        this.setDefaultClseeOperation(JFrame-EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayyout(new GridBagLayout());
        loginRepsoitory = new LoginResposoitory();
        creaComponentes ();

        private void creacomponentes(){
        gbc.insets = new Insets(10,10,10,10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheigth = 1;
        gbc.weigthx = 1.0;
        gbc.wigthty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        textLabel = new Jlabel("Registrase");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textJLabel, gbc);

        registrateJLabel = new JLable("Registrate");
        registrateJLabel.setHorizontalAlignment(SwingConstants.RIGTH);
        gbc.grid = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(registrateJLabel,gbc);

        nombreJLabel = new JLabel("Nombre");
        nombreJLable.setHorizontaAlignment(SwingConstants.RIGTH);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(nombreJLable,gbc);

        nombreTextField = new JTextField(100);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth =3;
        add(nombreTextField,gbc);

        emailJlabel =new JLabel("E-mail");
        emailJLable.setHorizontaAlignment(SwingConstants.RIGTH);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(emailJLable,gbc);

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

        registrarJButton = new JButton("Registrarse");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        registrarJButton.addActionListener(this);
        add(registrarJButton, gbc);

        @override 

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

        private String damePassword() {
            char[] passwordChars = contraseniaJPasswordField.getPassword();
            String password = new String(passwordChars);
            return password;
        }










        



        }



    }








}