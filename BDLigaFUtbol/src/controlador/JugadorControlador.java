
package controlador;

import DAO.JugadorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Jugador;
import vista.*;


public class JugadorControlador
{
    private VentanaMenu vista;
    private JugadorDAO jugadorDAO;
    
    public JugadorControlador(VentanaMenu vista)
    {
        this.vista=vista;
        jugadorDAO=new JugadorDAO();
        
        vista.getPanelJugador().getBtnAgregar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //System.out.println("hola");
                guardarJugador();
            } 
        });
        
        vista.getPanelJugador().getBtnListar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                listarJugador();
            }   
        });
    }
    
    public void guardarJugador()
    {
        int cod=vista.getPanelJugador().codigo();
        String nombre=vista.getPanelJugador().getNombre();
        String fechaNacimiento=vista.getPanelJugador().getFechaNacimiento();
        
        Jugador jugador=new Jugador(cod,nombre,fechaNacimiento);
        
        boolean resultado=jugadorDAO.guardarJugador(jugador);
        if(resultado)
        {
            JOptionPane.showMessageDialog(null, "Se ha guardadao");
            vista.getPanelJugador().setTxtCodigo("");
            vista.getPanelJugador().setTxtNombre("");
            vista.getPanelJugador().setTxtFechaNacimiento("");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No se  ha guardadao");
        }    
    }
    
    public void listarJugador()
    {
        DefaultTableModel modeloTabla=(DefaultTableModel) vista.getPanelJugador().getTblJugador().getModel();
        modeloTabla.setRowCount(0);
        
        ResultSet listado=jugadorDAO.listarJugador();
        try 
        {
            while(listado.next())
            {
                int cod=listado.getInt("codigoJugador");
                String nombre=listado.getString("nombre");
                String fechaNacimiento=listado.getString("fechaNacimiento");
                
                //System.out.println(cod+" "+nombre+" "+fechaNacimeinto);
                modeloTabla.addRow(new Object[]{cod,nombre,fechaNacimiento});
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(JugadorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
