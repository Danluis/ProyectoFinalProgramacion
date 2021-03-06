import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

public class frm_registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JPasswordField txtContrase?a;
	private JPasswordField txtC_Contrase?a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_registro frame = new frm_registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm_registro() {
		//Creamos una instancia de la clase metodo_sql para el boton guardar
		Metodo_sql metodos = new Metodo_sql();
		//Esto hara que las ventanas aparescan en el centro de la pantalla
				setLocationRelativeTo(null);
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 92, 142, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(56, 117, 77, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(56, 142, 77, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefono.setBounds(45, 167, 77, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(55, 192, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasea.setBounds(46, 217, 101, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblConfirmarcontrasea = new JLabel("Confirmar_Contrase\u00F1a:");
		lblConfirmarcontrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmarcontrasea.setBounds(46, 242, 168, 14);
		contentPane.add(lblConfirmarcontrasea);
		
		JLabel lblNewLabel_1 = new JLabel("Registro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(162, 11, 151, 29);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUsuario.setBounds(198, 89, 129, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(133, 117, 129, 20);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtApellido.setColumns(10);
		txtApellido.setBounds(133, 139, 129, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(133, 164, 129, 20);
		contentPane.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(133, 189, 147, 20);
		contentPane.add(txtCorreo);
		
		txtContrase?a = new JPasswordField();
		txtContrase?a.setBounds(133, 216, 129, 20);
		contentPane.add(txtContrase?a);
		
		txtC_Contrase?a = new JPasswordField();
		txtC_Contrase?a.setBounds(214, 241, 129, 20);
		contentPane.add(txtC_Contrase?a);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui verificamos que el usuario no deje campos vacios
				//Aqui pasamos los datos de las cajas de texto a la base de datos
				if (txtUsuario.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "El campo nombre de usuario esta vacio");
				} else {
				
				if (txtNombre.getText().equals(""))
				{ 
					JOptionPane.showMessageDialog(null, "El campo nombre esta vacio");
				} else {
				
				if (txtApellido.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "El campo Apellido esta vacio");
				} else {
				
				if (txtCorreo.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "El campo Correo esta vacio");
				} else {
				
				if (txtContrase?a.equals(""))
				{
					JOptionPane.showMessageDialog(null, "El campo Contrase?a esta vacio");
				} else {
				
				if (txtC_Contrase?a.equals(""))
				{
					JOptionPane.showMessageDialog(null, "El campo Confirmar_Contrase?a esta vacio");
				} else {
					//aqui verificamos que las contrase?as no sean iguales
					if (txtContrase?a.getText().equals(txtC_Contrase?a.getText()))
					{
						
					
			int i =	metodos.guardar(txtUsuario.getText(), txtNombre.getText(), txtApellido.getText(), txtTelefono.getText(), txtCorreo.getText(), txtContrase?a.getText(), txtC_Contrase?a.getText());
					
			if (i>0) {
				System.out.println("Datos guardados correctamente");
			}else {
				System.out.println("Los datos que ha ingresado no se han guardado correctamente");
			}
					 }else {
						 JOptionPane.showMessageDialog(null, "Las contrase?as no coinciden");
					 }
				}
				}
				}
				}
				}
				}
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(82, 293, 106, 23);
		contentPane.add(btnGuardar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui podemos usar la palabra ventana porque esta encapsulado dentro del metodo
				//Aqui creamos una instancia del Registro, un visible true para que sea visible y un dipose para cerrar la ventana anterior
				frm_menu ventana = new frm_menu();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegresar.setBounds(198, 293, 101, 23);
		contentPane.add(btnRegresar);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 255, 51));
		separator.setBounds(10, 43, 406, 2);
		contentPane.add(separator);
	}

}
