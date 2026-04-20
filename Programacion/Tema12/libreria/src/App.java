import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Cadena de conexión o URI
        String url = "jdbc:mysql://localhost:3306/ejemplo?characterEncoding=UTF-8";
        String autor;
        String isbn ;
        String titulo;
        String argumento;
        int paginas ;

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
                
                isbn = resultado.getString("ISBN");
                titulo = resultado.getString("titulo");
                paginas = resultado.getInt("paginas");

                System.out.printf("[%s] %s - Total páginas : %d\n",isbn,titulo,paginas);

            }

            String sql2 = "SELECT autor, COUNT(*) AS 'Total' " + 
                                "FROM libro " + 
                                "GROUP BY autor " + 
                                "HAVING COUNT(*) > 1 " + 
                                "ORDER BY autor;";
            Statement stmt2 = conexion.createStatement();

            ResultSet resultado2 = stmt2.executeQuery(sql2);

            while (resultado2.next()) {
                
                autor = resultado2.getString("autor");
                int total = resultado2.getInt("Total");

                System.out.printf("%s - Total libros: %d\n",autor,total);
        
            }
    

            resultado2.close();

            // =================================================================
            // INSERT
            System.out.println("ISBN:");
            isbn = System.console().readLine();

            System.out.println("titulo:");
            titulo = System.console().readLine();

            System.out.println("autor:");
            autor = System.console().readLine();

            System.out.println("páginas:");
            paginas = Integer.parseInt(System.console().readLine());

            System.out.println("argumento:");
            argumento = System.console().readLine();

            sql = String .format("(INSERT INTO libro (ISBN, titulo, autor,paginas,argumento) VALUES ('%s',%s','%s',%d,'%s');", isbn,titulo,autor,paginas,argumento);
            // utilizamos el metodo execute para consulta SELECT, INSERT, UPDATE, DELETE
            // true si la consulta genera un ResultSet (SELECT)
            // false en caso de lanzar una consulta INSERT, DELETE o UPDATE

            stmt.execute(sql);
            if (stmt.getUpdateCount() == 0) {
                System.out.println("**ERROR, No se ha podio insertar el libro a la base de datos");
            } else {
                System.out.println("La inserción del libro ha sido realizada");
            }

            // =================================================================
            // UPDATE: Actualizamos el nombre de la autora J.K. Rowling por Joanne Rowling

            sql ="UPDATE libro " + 
                "SET autor = 'Joanne Rowling' " + 
                "WHERE autor LIKE '%Rowling';";
            
            int total = stmt.executeUpdate(sql);

            System.out.printf("Registros modificados : %d",total);
            
            // =================================================================
            // DELETE

            sql ="DELETE FROM libro WHERE ISBN = 'snaskentt13sf';";
            stmt.execute(sql2);

            if (stmt.getUpdateCount() > 0) {
                System.out.printf("El registro se ha borrado con exito.");
            } else {
                System.out.println("**ERROR: No se podido borrar el registro.");
            }

        } catch (SQLException e) {
            System.out.println("**ERROR, Ha sucedido un error con la base de datos" + e.getMessage());
        }
    }
}
