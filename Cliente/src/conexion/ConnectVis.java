package conexion;
import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;


public class ConnectVis {
    public ConnectVis() {
        super();
    }
  
    
    
    public static Connection conexionVis()throws SQLException{
        Connection cn=null;
        String user="Visitante";
        String pass="visitante";
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        OracleDataSource ds= new OracleDataSource();
        ds.setURL(url);
        cn=ds.getConnection(user, pass);
        return cn;
    }
    

    public static void main(String[] args)throws SQLException {
       conexionVis();
    }
    
    
    
    
}
