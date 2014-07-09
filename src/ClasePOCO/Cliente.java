/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasePOCO;

/**
 *
 * @author V1C70R MU3N735
 */
public class Cliente 
{

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, double cupo, String cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cupo = cupo;
        this.cedula = cedula;
    }
    
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String direccion;

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private double cupo;

    /**
     * Get the value of cupo
     *
     * @return the value of cupo
     */
    public double getCupo() {
        return cupo;
    }

    /**
     * Set the value of cupo
     *
     * @param cupo new value of cupo
     */
    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    private String cedula;

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
