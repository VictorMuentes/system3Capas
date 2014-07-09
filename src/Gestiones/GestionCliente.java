/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexion;
import ClasePOCO.Cliente;
import java.sql.SQLException;


/**
 *
 * @author V1C70R MU3N735
 */
public class GestionCliente implements IGestion
{

    public GestionCliente() 
    {
        Conexion.setCadena("jdbc:mySql://localhost/facturacion");
        Conexion.setUsuario("root");
        Conexion.setPass("");
    }
    
    private Cliente client=new Cliente();
    public Cliente getCliente()
    {
    return client;
    }
    public void setCliente(Cliente client)
    {
    this.client=client;
    }
    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into cliente(cedula,nombre,direccion,cupo) values ('"+this.client.getCedula()+"','"+this.client.getNombre()+"','"+this.client.getDireccion()+"',"+this.client.getCupo()+")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }

    @Override
    public void Modificar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("update cliente set (nombre='"+this.client.getNombre()+"',direccion='"+this.client.getDireccion()+"',Cupo="+this.client.getCupo()+")where='"+this.client.getCedula()+"'");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Nuevo() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into cliente(cedula,nombre,direccion,cupo) values ('"+this.client.getCedula()+"','"+this.client.getNombre()+"','"+this.client.getDireccion()+"',"+this.client.getCupo()+")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Eliminar() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("delete * from cliente where cedula='"+this.client.getCedula()+"')");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Consultar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("seletc from cliente where cedula='"+this.client.getCedula()+"')");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }
    
}
