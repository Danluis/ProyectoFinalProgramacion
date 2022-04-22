import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frm_registro_producto extends JFrame {

	private JPanel contentPane;
	private JTextField txtProducto;
	private JTextField txtMarca;
	private JTextField txtCategoria;
	private JTextField txtPrecio;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_registro_producto frame = new frm_registro_producto();
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
	public frm_registro_producto() {
		Metodo_sql metodos = new Metodo_sql();
		setTitle("Registro producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 311);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProducto = new JLabel("Nombre_Producto");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProducto.setBounds(10, 56, 134, 14);
		contentPane.add(lblProducto);
		
		JLabel lblMarcaProducto = new JLabel("Marca Producto");
		lblMarcaProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarcaProducto.setBounds(20, 87, 124, 14);
		contentPane.add(lblMarcaProducto);
		
		JLabel lblCategoria = new JLabel("Categoria Producto");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 122, 147, 20);
		contentPane.add(lblCategoria);
		
		JLabel lblPrecioProducto = new JLabel("Precio Producto");
		lblPrecioProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecioProducto.setBounds(20, 153, 124, 14);
		contentPane.add(lblPrecioProducto);
		
		JLabel lblStockProducto = new JLabel("Stock Producto");
		lblStockProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStockProducto.setBounds(26, 184, 118, 14);
		contentPane.add(lblStockProducto);
		
		txtProducto = new JTextField();
		txtProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtProducto.setBounds(154, 53, 86, 20);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMarca.setColumns(10);
		txtMarca.setBounds(154, 84, 86, 20);
		contentPane.add(txtMarca);
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(154, 119, 86, 20);
		contentPane.add(txtCategoria);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(154, 150, 86, 20);
		contentPane.add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(154, 181, 86, 20);
		contentPane.add(txtCantidad);
		
		JLabel lblNewLabel = new JLabel("Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(64, 11, 142, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i =	metodos.guardar_registro(txtProducto.getText(), txtMarca.getText(), txtCategoria.getText(), txtPrecio.getText(), txtCantidad.getText());
				
				if (i>0) {
					System.out.println("Datos guardados correctamente");
				}else {
					System.out.println("Los datos que ha ingresado no se han guardado correctamente");
				}
				
			}
		});
		btnGuardar.setBounds(10, 229, 102, 23);
		contentPane.add(btnGuardar);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_producto ventana = new frm_producto();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(122, 229, 118, 23);
		contentPane.add(btnNewButton_1);
	}
}
