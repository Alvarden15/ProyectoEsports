package conexion;
//Este es para conectarse a la base de datos con el usuario del admin
import java.sql.Connection;

import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class Connect {
    public Connect() {
        super();
    }
    public static Connection GetConnection()
        {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String usr = "Prueba", pss ="prueba0451";
            
            Connection cn;
            OracleDataSource ods;
            
            try
            {
                ods = new OracleDataSource();
                ods.setURL(url);
                cn = ods.getConnection(usr, pss);
                
                System.out.println("Connectado con exito");
                return cn;

            }
            catch(SQLException s){}
            return null;
        }
    
    public static void main(String[] args) {
        GetConnection();
    }
    
}
