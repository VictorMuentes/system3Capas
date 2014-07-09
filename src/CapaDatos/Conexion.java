/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author V1C70R MU3N735
 */
public class Conexion 
{
 Connection Conn=null;
    PreparedStatement Sentencia=null;
    ResultSet setDeResultados=null;
    static String  usuario=null;
    static String cadena=null;
    static String pass=null;
    
    public static void setUsuario(String usuario)
    {
    Conexion.usuario=usuario;
    }
    public static void setCadena(String cadena)
    {
    Conexion.cadena=cadena;
    }
    public static void setPass(String pass)
    {
    Conexion.pass=pass;
    }
    
    private static Conexion instancia=null;
   
    public static Conexion GetInstancia()
    {
        if (instancia==null) 
        {
            instancia=new Conexion();
        }
        return instancia;
    }


    
    
    public void Conectar()
    {
        try
        {
        Conn=DriverManager.getConnection(cadena, usuario, pass);
        }
        catch(SQLException e)
        {
            e.getStackTrace();
        }
        
        
    }
    public void Desconectar()
    {
        try{
        Conn.close();
        }
        catch(SQLException e)
        {
        e.getStackTrace();
        }
    }
    
    public void Ejecutar(String cadena) throws SQLException
    {
        try{
        Sentencia=Conn.prepareStatement(cadena);
        Sentencia.execute();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    
    
}
