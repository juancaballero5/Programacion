import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Cadena de conexión o URI
        String url = "jdbc:mysql://localhost:3306/ejemplo?characterEncoding=UTF=8";

        try {
            // Establecemos la conexión correctamente con el motor de base de datos
            // Necesitamos URI, nombre usuarioy contraseña de acceso
            Connection conexion = DriverManager.getConnection(url,"root", "root");

            // Mostramos mensaje de conexión
            System.out.println("**INFO: Se ha conectado correctamente con la base de datos.");

            // Construimos una consulta
            String sql = "SELECT * FROM libro ;";
            Statement stmt = conexion.createStatement();

            ResultSet resultado = stmt.executeQuery(sql);

            while (resultado.next()) {
                
                String isbn = resultado.getString("ISBN");
                String titulo = resultado.getString("titulo");
                int paginas = resultado.getInt("paqginas");

                System.out.printf("[%s] %s - Total páginas : %d\n",isbn,titulo,paginas);
            }

            resultado.close();

        } catch (SQLException e) {
            System.out.println("**ERROR, Ha sucedido un error con la base de datos" + e.getMessage());
        }
    }
}
