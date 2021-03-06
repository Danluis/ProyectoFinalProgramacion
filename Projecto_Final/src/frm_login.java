import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frm_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrase?a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_login frame = new frm_login();
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
	public frm_login() {
		Metodo_sql metodos = new Metodo_sql();
		//Esto hara que las ventanas aparescan en el centro de la pantalla
				setLocationRelativeTo(null);
		setTitle("Inicio de sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 296);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicie sesion");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(114, 11, 180, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 96, 140, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(53, 137, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			
			//Aqui llamamos a los metodos buscar_nombre y buscar_usuario_registrado
			public void actionPerformed(ActionEvent e) {
				
				String busqueda_usuario=metodos.buscarUsuarioRegistrado(txtUsuario.getText(),txtContrase?a.getText());
				if (txtUsuario.getText().equals("root") && txtContrase?a.getText().equals("root")) {
					frm_principal ventana = new frm_principal();
				System.out.println( "Bienvenido iniciaste sesion como administrador");
				ventana.setVisible(true);
				dispose();
				
			}else if(busqueda_usuario.equals("usuario encontrado")){
				String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
				System.out.println("Bienvenido(a) /n" + busqueda_nombre);
				frm_principal ventana = new frm_principal();
				ventana.setVisible(true);
				dispose();
			}else {
				System.out.println("Usuario no encontrado");
			}
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEntrar.setBounds(99, 194, 89, 23);
		contentPane.add(btnEntrar);
		
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
		btnRegresar.setBounds(213, 194, 103, 23);
		contentPane.add(btnRegresar);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUsuario.setBounds(183, 93, 161, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrase?a = new JPasswordField();
		txtContrase?a.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtContrase?a.setBounds(183, 134, 161, 20);
		contentPane.add(txtContrase?a);
	}
}
