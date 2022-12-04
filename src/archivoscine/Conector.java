package archivoscine;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static final String DRIVER="com.mysql.jdbc.Driver"; //Driver conexión al motor BD
    private static final String USER="user"; //usuario del servidor de BD
    private static final String PASS="User123456"; //contraseña del usuario BD
    private static final String URL="jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false"; //ubicación del servidor y nombre de BD
    private static Connection  conn;
   
    public Conector() {
        conn= null;
        try{
            Class.forName(DRIVER);
            // conección con la base de datos
            conn=DriverManager.getConnection(URL,USER, PASS);
            // si se consigue conectar muestra mensaje
            if(conn!= null){
                System.out.println("Conectado");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error al conectar " + e);
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
    public void close(){
        conn = null;
        if(conn == null){
            System.out.println("Conexión cerrada");
        }
    }
}