import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class frm_producto extends JFrame {

	private JPanel contentPane;
	private JTable tablaProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_producto frame = new frm_producto();
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
	public frm_producto() {
		setTitle("Producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 387);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 102));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductosDeAlmacen = new JLabel("Productos de Almacen");
		lblProductosDeAlmacen.setBounds(87, 11, 417, 37);
		lblProductosDeAlmacen.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblProductosDeAlmacen);
		
		tablaProducto = new JTable();
		tablaProducto.setBounds(26, 59, 448, 202);
		contentPane.add(tablaProducto);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui podemos usar la palabra ventana porque esta encapsulado dentro del metodo
				//Aqui creamos una instancia del Registro, un visible true para que sea visible y un dipose para cerrar la ventana anterior
				frm_principal ventana = new frm_principal();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(248, 286, 226, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("Nuevo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_registro_producto ventana = new frm_registro_producto();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(36, 286, 215, 35);
		contentPane.add(btnNewButton_1_1);
	}

}
