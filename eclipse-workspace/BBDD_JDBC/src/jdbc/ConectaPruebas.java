package jdbc;
import java.sql.*;

public class ConectaPruebas {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/pruebas";
        String usuario = "root";
        String contrasena = "";

        try {
        Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            
            // Consulta SQL para obtener los datos
            String consulta = "SELECT NOMBREARTICULO, CODIGOARTICULO, PRECIO FROM PRODUCTOS"; 
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            // Mostrar resultados en consola
            System.out.println("Productos:");
            while (resultado.next()) {
                String nombre = resultado.getString("NOMBREARTICULO");
                String codigo = resultado.getString("CODIGOARTICULO");
                double precio = resultado.getDouble("PRECIO");
                System.out.println(nombre + " - " + codigo + " - " + precio);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos: " + e.getMessage());
        }

	}

}
