import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Color;

public class frm_usuario extends JFrame {

	private JPanel contentPane;
	public static DefaultTableModel model;
	private JTable tabla_Usuario;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_usuario frame = new frm_usuario();
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
	public frm_usuario() {

		//Aqui tenemos la conexion de la tabla con la base de datos
		
		//Cargar();

		//CargarTabla();
		
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes registrados");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(98, 11, 316, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_principal ventana = new frm_principal();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(363, 301, 127, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(146, 301, 106, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Nuevo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_registro ventana = new frm_registro();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(32, 301, 106, 35);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Eliminar");
		btnNewButton_1_2.setBounds(250, 301, 117, 35);
		contentPane.add(btnNewButton_1_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(463, 70, 17, 210);
		contentPane.add(scrollBar);
		
		tabla_Usuario = new JTable();
		tabla_Usuario.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		tabla_Usuario.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"User_name", "Nombre", "Apellido", "Telefono", "Email", "Contrase\u00F1a", "C_Contrase\u00F1a"
			}
		));
		tabla_Usuario.getColumnModel().getColumn(6).setPreferredWidth(89);
		tabla_Usuario.setBounds(32, 70, 448, 210);
		contentPane.add(tabla_Usuario);
		
		
		
	}

/*	public void CargarTabla() {
		frm_usuario a= new frm_usuario();
		DefaultTableModel modeloTabla = (DefaultTableModel) a.tabla_Usuario.getModel();
		modeloTabla.setRowCount(0);
		
		
		PreparedStatement ps;
		ResultSet rs;
		ResultSetMetaData rsmd;
		int columnas;
		
		try {
			Connection con = Conexion.conectar();
			ps =con.prepareStatement("SELECT User_Name,Nombre,Apellido,Telefono,Email,Contrase?a,C_Contrase?a FROM usuarios");
		    rs = ps.executeQuery();
		    rsmd = rs.getMetaData();
		    columnas = rsmd.getColumnCount();
		    
		    while(rs.next()) {
		    	Object[] fila = new Object[columnas];
		    	for (int indice=0; indice<columnas; indice++) {
		    		fila[indice]= rs.getObject(indice + 1);
		    	}
		    	modeloTabla.addRow(fila);
		    }
		}catch(SQLException e) {
		JOptionPane.showMessageDialog(null, e.toString());
	   }
	
	
}*/
}
