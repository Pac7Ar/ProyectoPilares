package screens;

public class VentanaEmpleado extends JFrame implements ActioListener {

    private LoginRepository loginRepository;
    private JLabel textJLabel;
    private JLabel empleadoJLabel;
    private JTextField empleadoJTextField;
    private JButton buscarJButton;
    private JLabel emailJLabel;
    private JPasswordField emailJPasswordField;
    private JButton guardarJButton;
    private JButton modificarJButton;
    private JButton eliminarJButton;

    public VentanaEmpleado() {
        super("Control de Empleados");
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

        textJLabel = new JLabel("Nombre");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textJLabel, gbc);

        nombreJLabel = new JLabel("Nombre");
        nombreJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(nombreJLabel, gbc);

        telefonoJTextField = new JTextField(100);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(telefonoJTextField, gbc);

        emailJLabel = new JLabel("E-mail:");
        emailJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(emailJLabel, gbc);

        emailJPasswordField = new JPasswordField(100);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(emailJPasswordField, gbc);

        guardarJButton = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        iniciarJButton.addActionListener(this);
        add(guardarJButton, gbc);

        modificarJButton = new JButton("Modificar");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        registrarJButton.addActionListener(this);
        add(modificarJButton, gbc);
    }





}
    

