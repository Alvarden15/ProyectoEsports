package dao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import beans.BeanEmp;
import beans.BeanGanadores;
import beans.BeanHeroe;
import beans.BeanTorneos;
import java.util.ArrayList;
import conexion.Connect;

import beans.BeanJuego;
import beans.BeanJugador;


public class DaoComandos {
    public DaoComandos() {
        super();
    }
    
    Connection cn =null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    ArrayList<BeanTorneos> listaTorneos= null;
    ArrayList<BeanGanadores> listaGanadores= null;
    ArrayList<BeanJugador> listaJugador= null;
    ArrayList<BeanJugador> listaPais= null;
    ArrayList<BeanEmp> listaEmpresa=null;
    ArrayList<BeanHeroe> listaH=null;
    ArrayList<BeanHeroe> mayorH=null;
    
    ArrayList<Integer> lisCodigo= new ArrayList<Integer>();

    public void registrar(BeanEmp be){
      
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Insert into Empresa values (?,?,?,?) ");
            ps.setInt(1, be.getCod());
            ps.setString(2, be.getNombre());
            ps.setString(3, be.getFecha());
            ps.setString(4, be.getDirect());
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en la conexion y/o comando");
        }
    }
    
    public void modificar(BeanEmp be){
        
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("UPDATE Empresa set NombreEmpresa=?,FechaFundacion=? ,SedePrincipal=?"+
                                   "where CodEmpresa=?");
            ps.setString(1, be.getNombre());
            ps.setString(3, be.getDirect());
            ps.setString(2, be.getFecha());
            ps.setInt(4, be.getCod());
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificarEmp1(String nom, int cod){
        
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("UPDATE Empresa set NombreEmpresa=? "+
                                   "where CodEmpresa=?");
            ps.setString(1,nom);
            ps.setInt(2,cod);
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificarEmp2(String fecha, int cod){
        
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("UPDATE Empresa set FechaFundacion=? "+
                                   "where CodEmpresa=?");
            ps.setString(1,fecha);
            ps.setInt(2,cod);
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificarEmp3(String sede, int cod){
        
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("UPDATE Empresa set SedePrincipal=?"+
                                   "where CodEmpresa=?");
            ps.setString(1,sede);
            ps.setInt(2,cod);
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificarEmp21(String nombre,String fecha, int cod){
        
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("UPDATE Empresa set NombreEmpresa=?, FechaFundacion=? "+
                                   "where CodEmpresa=?");
            ps.setString(1,nombre);
            ps.setString(2,nombre);
            ps.setInt(3,cod);
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    public void eliminar(int cod){
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Delete from Empresa where codEmpresa=?");
            ps.setInt(1, cod);
            ps.execute();
            
            ps.close();
            cn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Integer> listarCodigos(){
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Select Codigo from Empresa");
            rs=ps.executeQuery();
            while(rs.next()){
               lisCodigo.add(rs.getInt(1));
            } 
            return lisCodigo;
        }catch(Exception e){
            e.printStackTrace();
           return null; 
        }
    }
    
    public int buscarCod(int codigo){
        lisCodigo = listarCodigos();
        for(int li: lisCodigo){
            if(li==codigo){
               
                return 1;
                
            }
        }
        
        return 0;
    }
    
    public void registrarJuego(BeanJuego bj){
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("insert into Juegos values"+
                                   "(?,?,?,?,?,?,?)");
            ps.setInt(1, bj.getCodJuego());
            ps.setString(2, bj.getNombre());
            ps.setString(3, bj.getGenero());
            ps.setString(4,bj.getCalificacion());
            ps.setDouble(5, bj.getPrecio());
            ps.setInt(6, bj.getCodEmp());
            ps.setString(7, bj.getModalidad());
            
            ps.execute();
            
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void modificarJuego(BeanJuego bj){
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("update Juegos set nomJuego=?,Genero=?,Calificacion=?,Precio=?,"+
                                   "Empresa_CodEmpresa=?, Modalidad=?"+
                                   "where ID_Juego=?");
            
           
            ps.setString(1, bj.getNombre());
            ps.setString(2, bj.getGenero());
            ps.setString(3,bj.getCalificacion());
            ps.setDouble(4, bj.getPrecio());
            ps.setInt(5, bj.getCodEmp());
            ps.setString(6, bj.getModalidad());
            ps.setInt(7, bj.getCodJuego());
            ps.execute();
            
            ps.close();
            cn.close();
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
    
    public void eliminarJuego(int cod){
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Delete from Juego where ID_Juego=?");
            ps.setInt(1, cod);
            ps.execute();
            
            ps.close();
            cn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    public ArrayList<BeanGanadores> listadoGanador(String fecha, String nombre){
        try{
            listaGanadores= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select j.Nombre,p.Resultado,t.FechaTorneo,t.NombreTorneo, "+
                                   "case when p.Puntos < p.Asistencias then 'Asistente' "+
                                   " else 'Normal' end \"Clasificacion\" "+
                                   "from Jugador j, Torneo_Resultados p, Torneo t  "+
                                   "where j.ID_Jugador= p.ID_Jugador and p.Id_Torneo=t.Id.Torneo and " +
                "j.ID_Jugador= p.ID_Jugador and p.Id_Torneo=t.ID_TORNEO and t.FechaTorneo=? and p.Resultado LIKE 'Ganador' and t.NOMBRETORNEO like ?");
            ps.setString(1, fecha);
            ps.setString(2, nombre);
            rs=ps.executeQuery();
            while(rs.next()){
                BeanGanadores bg= new BeanGanadores();
                bg.setNombreGanador(rs.getString(1));
                bg.setResultado(rs.getString(2));
                bg.setFechaTorneo(rs.getString(3));
                bg.setNombreTorneo(rs.getString(4));
                bg.setCalifica(rs.getString(5));
                listaGanadores.add(bg);
                
                
            }
            rs.close();
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaGanadores;
    }
    
    
    
    public ArrayList<BeanTorneos> listadoTorneos(String text){
      
        try{
            listaTorneos= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select j.Nombre ,t.FechaTorneo,t.NombreTorneo "+ 
                                   "FROM Jugador j, Torneo_Resultados p, Torneo t "+
                                   "where j.Nickname= p.Nickname and p.Id_Torneo=t.Id_Torneo and t.NombreTorneo=?");
           ps.setString(1, text);
            rs=ps.executeQuery();
            while(rs.next()){
                BeanTorneos bt= new BeanTorneos();
                bt.setNombres(rs.getString(1));
                bt.setNombret(rs.getString(2));
                bt.setFecha(rs.getString(3));
                listaTorneos.add(bt);
            }
            
            rs.close();
            ps.close();
            cn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return listaTorneos;
    }
    
    public ArrayList<BeanJugador> jugadores(){
        try{
            listaJugador= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select * from jugador");
            rs=ps.executeQuery();
            while(rs.next()){
                BeanJugador bj= new BeanJugador();
                bj.setId(rs.getString(1));
                bj.setNombre(rs.getString(2));
                bj.setApellido(rs.getString(3));
                bj.setPais(rs.getString(4));
                bj.setFechaNac(rs.getString(5));
                bj.setFechaRec(rs.getString(6));
                bj.setEmail(rs.getString(7));
                bj.setSexo(rs.getString(8));
                bj.setCodigoEquipo(rs.getInt(9));
               
                listaJugador.add(bj);
            }
            rs.close();
            ps.close();
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return listaJugador;
    }
    
    public ArrayList<BeanJugador> jugadorpais(){
        try{
            listaPais= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select Pais, count(Nickname) from Jugador group by Pais");
            rs=ps.executeQuery();
            while(rs.next()){
                BeanJugador bj= new BeanJugador();
                bj.setPais(rs.getString(1));
                bj.setCantidad(rs.getInt(2));
                listaPais.add(bj);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return listaPais;
    }
    
    public ArrayList <BeanEmp> listadoJuegos(){
        try{
            listaEmpresa= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select e.nombreempresa, j.nomjuego, "+
                                   "case when  j.Precio =0 then 'Gratuito' "+
                                   "else 'De pago' "+
                                   "end ,"+
                                   "case when Calificacion like 'Todas las edades' then 'E' "+
                                   "when Calificacion like 'Adolecentes' then 'T' "+
                                   " else 'M' "+
                                   "end "+
                                   "from empresa e, juego j "+
                                   " where j.CODEMPRESA= e.CODEMPRESA "+
                                   "and e.NOMBREEMPRESA like 'Valve';"
                                   );
           
            
            rs=ps.executeQuery();
            while(rs.next()){
                listaEmpresa.add(new BeanEmp(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        
        return listaEmpresa;
    }
    
    public ArrayList <BeanEmp> listadoEmp(){
        try{
            listaEmpresa= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Select * from empresa");
            
            rs=ps.executeQuery();
            while(rs.next()){
                listaEmpresa.add(new BeanEmp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        
        return listaEmpresa;
    }
    
    
    
    public ArrayList <BeanEmp> listadoj(){
        try{
            listaEmpresa= new ArrayList<>();
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("select count(ID_Juego), e.NOMBREEMPRESA from juegos j, empresa e");
            
            rs=ps.executeQuery();
            while(rs.next()){
                listaEmpresa.add(new BeanEmp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        
        return listaEmpresa;
    }
    
    public void registrarJugador(BeanJugador bj){
        
        try{
            cn=Connect.GetConnection();
            ps=cn.prepareStatement("Insert into Jugador values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, bj.getId());
            ps.setString(2, bj.getNombre());
            ps.setString(3, bj.getApellido());
            ps.setString(4, bj.getPais());
            ps.setString(5, bj.getFechaNac());
            ps.setString(6, bj.getFechaRec());
            ps.setString(7, bj.getEmail());
            ps.setString(8, bj.getSexo());
            ps.setInt(9, bj.getCodigoEquipo());
            
            ps.execute();
            
            ps.close();
            
            cn.close();
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("Error :"+e.getMessage());
            
            
            
        }
        
    }
    
    public void modificarJugador(BeanJugador ar){
                  try{
                      cn=Connect.GetConnection();
                      ps=cn.prepareStatement("Update Jugador set NICKNAME=?, NOMBRE=?, APELLIDO=?, PAIS=?, FECHANACIMIENTO=?, FECHAREGISTRo=?, SEXO=?, EMAIL=?, EQUIPO_CODEQUIPO=?, where NICKNAME=?");
                      ps.setString(9,ar.getId());
                      ps.setString(1,ar.getNombre());
                      ps.setString(2,ar.getApellido());
                      ps.setString(3,ar.getPais());
                      ps.setString(4,ar.getFechaNac());
                      ps.setString(5,ar.getFechaRec());
                      ps.setString(6,ar.getSexo());
                      ps.setString(7,ar.getEmail());
                      ps.setInt(8,ar.getCodigoEquipo());
                      ps.executeUpdate();
                      cn.close();
                      System.out.print("Modificado con exito");
                  }catch(Exception e){
                      e.printStackTrace();
                      System.out.print("Error :"+e.getMessage());
                  }
              }
    
    
    public void RegistrarHeroe(BeanHeroe obj)
      {
       
         try
         {
             cn= Connect.GetConnection();
             ps=cn.prepareStatement("insert into HEROES values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
             ps.setString(2, obj.getNickname());
             ps.setString(1, obj.getHeroe());
             ps.setDouble(3, obj.getK());
             ps.setDouble(4, obj.getD());
             ps.setDouble(5, obj.getA());
             ps.setDouble(6, obj.getKda());
             ps.setDouble(7, obj.getWin());
             ps.setInt(8, obj.getPartidas());
             ps.setInt(9, obj.getCore());
             ps.setInt(10, obj.getSupp());
             ps.setInt(11, obj.getMid());
             ps.setInt(12, obj.getSafe());
             ps.setInt(13, obj.getOff());
             ps.setInt(14, obj.getJungla());
             ps.setInt(15, obj.getRoaming());
             
            ps.execute();
             ps.close();
             cn.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
             System.out.print("Error :"+e.getMessage());
         }
      }
             
     
      
      public void eliminarHeroe(String nickname, String heroe ){
              try{
                  cn=Connect.GetConnection();
                  ps=cn.prepareStatement("delete HEROES where NICKNAME=? and ID_HEROE=?");
                  ps.setString(1, nickname);
                  ps.setString(2, heroe);
                  ps.execute();
                  ps.close();
                  cn.close();  
              }catch(Exception e){
                  e.printStackTrace();
                  System.out.print("Error :"+e.getMessage());
              }  
          }
      
      public void modificarHeroe(BeanHeroe h){
              try{
                  cn=Connect.GetConnection();
                  ps=cn.prepareStatement("Update HEROES set K=?,D=?,A=?,KDA=?,WIN=?,PARTIDAS=?,CORE=?,SUPP=?,MID=?,SAFE=?,OFF=?,JUNGLA=?,ROAMING=?  where NICKNAME=? AND ID_HEROE=?");
                  ps.setString(14,h.getNickname());
                  ps.setString(15,h.getHeroe());
                  ps.setDouble(1, h.getK());
                  ps.setDouble(2, h.getD());
                  ps.setDouble(3, h.getA());
                  ps.setDouble(4, h.getKda());
                  ps.setDouble(5, h.getWin());
                  ps.setInt(6, h.getPartidas());
                  ps.setInt(7, h.getCore());
                  ps.setInt(8, h.getSupp());
                  ps.setInt(9, h.getMid());
                  ps.setInt(10, h.getSafe());
                  ps.setInt(11, h.getOff());
                  ps.setInt(12, h.getJungla());
                  ps.setInt(13, h.getRoaming());
                  
                  ps.executeUpdate();
                  cn.close();
                  System.out.print("Modificado con exito");
              }catch(Exception e){
                  e.printStackTrace();
                  System.out.print("Error :"+e.getMessage());
              }
          }
      
      public ArrayList<BeanHeroe> visualizarHeroe(){
          try{
              cn=Connect.GetConnection();
              ps=cn.prepareStatement("select * from Heroes");
              rs=ps.executeQuery();
              while(rs.next()){
                  BeanHeroe bh= new BeanHeroe();
                  bh.setNickname(rs.getString(2));
                  bh.setHeroe(rs.getString(1));
                  bh.setK(rs.getDouble(3));
                  bh.setD(rs.getDouble(4));
                  bh.setA(rs.getDouble(5));
                  bh.setKda(rs.getDouble(6));
                  bh.setWin(rs.getDouble(7));
                  bh.setPartidas(rs.getInt(8));
                  bh.setCore(rs.getInt(9));
                  bh.setSupp(rs.getInt(10));
                  bh.setMid(rs.getInt(11));
                  bh.setSafe(rs.getInt(12));
                  bh.setOff(rs.getInt(13));
                  bh.setJungla(rs.getInt(14));
                  bh.setRoaming(rs.getInt(15));
                  listaH.add(bh);
              }
              rs.close();
              ps.close();
              cn.close();
              
          }catch(Exception e){
              e.printStackTrace();
              
          }
          return listaH;
      }
      
      public ArrayList<BeanHeroe> mayorK(){
          
          try{
          cn=Connect.GetConnection();
          ps=cn.prepareStatement("select h.Nickname, j.Nombre, j.APELLIDO,h.K  from jugador j, heroes h "+
                                 "where j.NICKNAME= h.NICKNAME and h.K=(select max(k) from Heroes)");
              rs=ps.executeQuery();
              while(rs.next()){
                  BeanHeroe bh= new BeanHeroe();
                  bh.setNickname(rs.getString(1));
                  bh.setNombreJ(rs.getString(2));
                  bh.setApellidoJ(rs.getString(3));
                  bh.setCantidad(rs.getDouble(4));
                  mayorH.add(bh);
                  
              }
              rs.close();
              ps.close();
              cn.close();
          }catch(Exception e){
              e.printStackTrace();
          }
          
          
        return mayorH;
      }
    
    
    
}
