package archivoscine;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Operaciones {
    
    private static final String SQL_INSERT_SALAS="insert into Salas(nSala,nFilas,nColumnas,nColumVIP) values (?,?,?,?)";
    private static final String SQL_INSERT_CARTELERA="insert into Cartelera(nomPeli,hInicio,hFin,nSala) values (?,?,?,?)";
    private static final String SQL_INSERT_TAQUILLA="insert into Taquilla(nUsuario,nomPeli,nSillas) values (?,?,?)";
    private static final String SQL_INSERT_SILLAS="insert into Sillas(nSillas,sVIP,Sillas) values (?,?,?)";
    
    
    
    //consulta 
    private static  final String SQL_SELECT_SALAS="SELECT nSala from Salas;";
    
    private PreparedStatement  PS;   
    Conector cn;
    private  ResultSet RS;
    
    public Operaciones() {
        PS = null;
        cn = new Conector();
        
    }
    int nRandom = (int)(Math.random()*100+1);
    public int insertSalas(int nSala, int nFilas, int nColumnas, int nColumVIP ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT_SALAS);
            PS.setInt(1, nSala);
            PS.setInt(2, nFilas);
            PS.setInt(3, nColumnas);
            PS.setInt(4, nColumVIP);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando en la tabla salas"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertCartelera(String nomPeli, String hInicio, String hFin, int nSala ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT_CARTELERA);
            PS.setString(1, nomPeli);
            PS.setString(2, hInicio);
            PS.setString(3, hFin);
            PS.setInt(4, nSala);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando en la tabla cartelera"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertTaquilla(String nUsuario, String nomPeli, int nSillas){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT_TAQUILLA);
            PS.setString(1, nUsuario);
            PS.setString(2, nomPeli);
            PS.setInt(3, nSillas);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando en la tabla taquilla"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertSillas( int sVIP, String Sillas ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT_SILLAS);
            PS.setInt(1,nRandom);
            PS.setInt(2, sVIP);
            PS.setString(3, Sillas);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando en la tabla sillas"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }

    public ArrayList getListaSalas() {
        ArrayList mListaSalas = new ArrayList();
        listaConsultas mConsulta = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = cn.getConexion().prepareStatement(SQL_SELECT_SALAS);
            resultado = consulta.executeQuery("SELECT nSala from Salas;");

            while (resultado.next()) {
                mConsulta = new listaConsultas();
                mConsulta.setnSalas(resultado.getInt("nSala"));
                mListaSalas.add(mConsulta);
            }
        } catch (SQLException e) {
        }
        return mListaSalas;
    }
    public ArrayList getListaPeli(String peticion){
        ArrayList mListaPeli =new ArrayList();
        listaConsultas mConsulta = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = cn.getConexion().prepareStatement(SQL_SELECT_SALAS);
            resultado = consulta.executeQuery("SELECT * from cartelera;");

            while (resultado.next()) {
                mConsulta = new listaConsultas();
                mConsulta.setNomPeli(resultado.getString(peticion));
                mListaPeli.add(mConsulta);
            }
        } catch (SQLException e) {
        }
        return mListaPeli;
    }
  
    //consulta para tabla cartelera con la pelicula que selecciono el usuario.
    public ResultSet getListaPeliH(String nP) {
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.getConexion().createStatement();
            rs = st.executeQuery("SELECT * FROM CARTELERA WHERE nomPeli= '"+ nP +"' ;");

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
    //consulta para validar el tipo de silla y guardar el dato
    public ResultSet getTipoSilla(String nSala){
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.getConexion().createStatement();
            rs = st.executeQuery("SELECT nColumVIP FROM salas WHERE nSala= '"+nSala +"' ;");

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    //consulta para guardar en taquilla
    public ResultSet getNSilla(String sillas){
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.getConexion().createStatement();
            rs = st.executeQuery("SELECT nSillas FROM sillas WHERE Sillas= '"+sillas +"' ;");

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public boolean deleteTickete( String nUsuario ){
        boolean resultado = false;

    try {
        String sql = "Delete from taquilla where id = '"+nUsuario+"';";
        cn.getConexion();
        Statement st = cn.getConexion().createStatement();
        int valor = st.executeUpdate(sql);
        if(valor>0){
            resultado = true;
        }
        cn.getConexion().close();
        st.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar "+ nUsuario + e.getMessage());
    }
        return resultado;
    }
    
    public boolean updateTickete( String nUsuario, String numPeli ){
        boolean resultado = false;

    try {
        String sql = "update taquilla set nomPeli = '"+numPeli+"' where nUsuario ='"+nUsuario+"';";
        cn.getConexion();
        Statement st = cn.getConexion().createStatement();
        int valor = st.executeUpdate(sql);
        if(valor>0){
            resultado = true;
        }
        cn.getConexion().close();
        st.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar "+ nUsuario + e.getMessage());
    }
    return resultado;
    }
    
  
}