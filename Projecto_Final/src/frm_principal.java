import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class frm_principal extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_principal frame = new frm_principal();
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
	public frm_principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 261);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Usuarios");
		btnNewButton.setBackground(new Color(0, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui podemos usar la palabra ventana porque esta encapsulado dentro del metodo
				//Aqui creamos una instancia del Registro, un visible true para que sea visible y un dipose para cerrar la ventana anterior
				frm_usuario ventana = new frm_usuario();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(27, 11, 141, 158);
		contentPane.add(btnNewButton);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.setBackground(new Color(0, 204, 153));
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui podemos usar la palabra ventana porque esta encapsulado dentro del metodo
				//Aqui creamos una instancia del Registro, un visible true para que sea visible y un dipose para cerrar la ventana anterior
				frm_producto ventana = new frm_producto();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnProductos.setBounds(195, 11, 141, 158);
		contentPane.add(btnProductos);
		
		JButton btnNewButton_1 = new JButton("Cerrar sesion");
		btnNewButton_1.setBackground(new Color(204, 51, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui podemos usar la palabra ventana porque esta encapsulado dentro del metodo
				//Aqui creamos una instancia del Registro, un visible true para que sea visible y un dipose para cerrar la ventana anterior
				frm_login ventana = new frm_login();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(370, 11, 128, 31);
		contentPane.add(btnNewButton_1);
	}

}
