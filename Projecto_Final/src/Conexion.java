import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//OJO AQUI HUBO UN PEQUEÑO CAMBIO AGREGANDO CJ EN EL MEDIO PORQUE EL ANTERIOR ESTA OBSOLETO
	//SE CAMBIO ESTE POR Class.forName("com.mysql.jdbc.Driver"); ESTE Class.forName("com.mysql.cj.jdbc.Driver")
	private static final String clase = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/proyecto_final";
	private static final String usuario = "root";
	private static final String contraseña = "admin";
	
	
	/*Cargamos el controlador dentro de un bloque static para no tener que llamar 
	  al controlador cada vez que llamemos al metodo conectar*/
	
	static {
		try {
			Class.forName(clase);
		} catch(ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
		    e.printStackTrace();
		}
	}
	
	//Luego de ver que la conexion funciona creamos un metodo para hacerla mas reutilizable
	
	public static Connection conectar() {
		
	
		Connection conexion = null;
		     //Cargar el controlador(cargar todas las clases necesarias para la conexion)
				try {
					
				//Estableciendo la conexion
					//El getConnection nos devuelve la conexion entre la base de datos y eclipse
					conexion=DriverManager.getConnection(url,usuario,contraseña);
					System.out.println("Conexion establecida Correctamente");
				}catch (SQLException e) {
					System.out.println("Error en al conexion");
				    e.printStackTrace();
				}
				return conexion;
	}
//Aqui tenemos el metodo main
	public static void main (String [] args) {
		//Aqui decimos que el jframe menú sea el que inicie primero la aplicación
		frm_menu.main(args);
	}
}


