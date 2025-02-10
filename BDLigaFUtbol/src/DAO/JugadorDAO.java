
package DAO;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jugador;

public class JugadorDAO 
{
    Statement mistatement;
    Connection con;
    
    public void conectar()
    {
        try 
        {
            if(con!=null&&con.isValid(0))
            {
                System.out.println("ya existe la conexion");
            }
            else
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ligaFutbol2","root","sebastian");
                mistatement=con.createStatement();
                System.out.println("conexion exitosa");
            }    
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean guardarJugador(Jugador jugador) 
    {
        conectar();
        try {
            //System.out.println("guardar datos");
            PreparedStatement query=con.prepareStatement("INSERT INTO Jugador (codigoJugador,nombre,fechaNacimiento) VALUES (?,?,?)");
            query.setInt(1,jugador.getCodJugador());
            query.setString(2,jugador.getNombre());
            query.setString(3,jugador.getApellido());
            query.executeUpdate();
            return true;
            //return false;
        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
    
    public ResultSet listarJugador()
    {
        conectar();
        try 
        {
            ResultSet listado=mistatement.executeQuery("SELECT * FROM Jugador");
            return listado;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
