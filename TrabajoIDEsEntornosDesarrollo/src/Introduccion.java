import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class Introduccion {

	private JFrame frame;
	private JTextField txtA;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introduccion window = new Introduccion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Introduccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIntroduccinClientes = new JLabel("INTRODUCCI\u00D3N CLIENTES");
		lblIntroduccinClientes.setBounds(109, 16, 304, 20);
		frame.getContentPane().add(lblIntroduccinClientes);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setBounds(146, 199, 115, 29);
		frame.getContentPane().add(btnEnviar);
		
		txtA = new JTextField();
		txtA.setBounds(199, 52, 146, 26);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(199, 84, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 120, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(61, 55, 69, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setBounds(61, 87, 92, 20);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setBounds(61, 123, 69, 20);
		frame.getContentPane().add(lblEmail);
	}
}
