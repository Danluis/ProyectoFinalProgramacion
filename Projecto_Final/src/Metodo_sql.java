import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Metodo_sql {

	//Creamos una instancia de la conexion a la base de datos para trabajar con el registro de usuarios
	public static Conexion conexion = new Conexion();
	
	public static PreparedStatement sentencia_preparada;
	public static ResultSet resultado;
	public static String sql;
	public static int resultado_numero;
	
	public int guardar(String nombre_de_usuario, String nombre, String apellido, String telefono, String correo, String Contraseņa, String C_Contraseņa) {
		int resultado = 0;
		Connection conexion = null;
		//Sentencia para guardar los campos en la base de datos
		String sentencia_guardar = ("INSERT INTO usuarios (User_Name,Nombre,Apellido,Telefono,Email,Password,C_Password) VALUES(?,?,?,?,?,?,?)");
		//Traemos un try catch para conectar la base de datos ya que esta va a requerir unas cuantas excepciones.
		try {
			conexion = Conexion.conectar();
			//Guardamos los datos
			sentencia_preparada = conexion .prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, nombre_de_usuario);
			sentencia_preparada.setString(2, nombre);
			sentencia_preparada.setString(3, apellido);
			sentencia_preparada.setString(4, telefono);
			sentencia_preparada.setString(5, correo);
			sentencia_preparada.setString(6, Contraseņa);
			sentencia_preparada.setString(7, C_Contraseņa);
			
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return resultado;
	}
	//Registro de Productos
	public int guardar_registro(String nombre_Producto, String marcaProducto, String Categoria, String Precio, String StockProducto) {
		int resultado = 0;
		Connection conexion = null;
		//Sentencia para guardar los campos en la base de datos
		String sentencia_guardar = ("INSERT INTO productos (NombreProducto,MarcaProducto,CategoriaProducto,PrecioProducto,StockProducto) VALUES(?,?,?,?,?)");
		//Traemos un try catch para conectar la base de datos ya que esta va a requerir unas cuantas excepciones.
		try {
			conexion = Conexion.conectar();
			sentencia_preparada = conexion .prepareStatement(sentencia_guardar);
			//Guardamos los datos
			sentencia_preparada.setString(1, nombre_Producto);
			sentencia_preparada.setString(2, marcaProducto);
			sentencia_preparada.setString(3, Categoria);
			sentencia_preparada.setString(4, Precio);
			sentencia_preparada.setString(5, StockProducto);
			
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return resultado;
	}
	
	
	
	//Busqueda nombre es un metodo para identificar que usuario inicio sesion
	public static String buscarNombre(String usuario) {
		String busqueda_nombre= null;
		Connection conexion= null;
		try {
			conexion = Conexion.conectar();
			String sentencia_buscar = ("SELECT Nombre,Apellido FROM usuarios WHERE User_Name='"+ usuario +"'");
		    sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
		    resultado =sentencia_preparada.executeQuery();
		    if(resultado.next()) {
		    	String Nombre = resultado.getString("Nombre");
		    	String Apellido = resultado.getString("Apellido");
		    	busqueda_nombre = (Nombre +" "+ Apellido);

		    }
		    
		    conexion.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return busqueda_nombre;
	}
	
	public static String buscarUsuarioRegistrado(String usuario, String contraseņa) {
		String busqueda_usuario = null;
		Connection conexion = null;
		
		try {
			conexion = Conexion.conectar();
			//Creamos un String para buscar el usuario
			String sentencia_buscar_usuario =("SELECT User_Name,Nombre,Apellido,Telefono,Email,Password,C_Password FROM usuarios WHERE User_Name = '"+usuario+"' && Password = '"+contraseņa+"'");
		   sentencia_preparada=conexion.prepareStatement(sentencia_buscar_usuario);
			resultado = sentencia_preparada.executeQuery();
		    if (resultado.next()) {
		    	busqueda_usuario="usuario encontrado";
		    }else {
		    	busqueda_usuario="usuario no encontrado";
		    }
		    conexion.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return busqueda_usuario;
	}
	

	}
	

   
   
