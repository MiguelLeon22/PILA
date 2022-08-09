/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author marco.acosta
 */
public class Productos extends Base{
    
        private String nombreProducto;
        private int cantidadProuctos;
        private double valorProducto;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProuctos, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProuctos = cantidadProuctos;
        this.valorProducto = valorProducto;
    }
        
    
    /**
     * Get the value of valorProducto
     *
     * @return the value of valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Set the value of valorProducto
     *
     * @param valorProducto new value of valorProducto
     */
    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }


    /**
     * Get the value of cantidadProuctos
     *
     * @return the value of cantidadProuctos
     */
    public int getCantidadProuctos() {
        return cantidadProuctos;
    }

    /**
     * Set the value of cantidadProuctos
     *
     * @param cantidadProuctos new value of cantidadProuctos
     */
    public void setCantidadProuctos(int cantidadProuctos) {
        this.cantidadProuctos = cantidadProuctos;
    }

        

    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Override
    public Base copy() {
        
        return new Productos(nombreProducto, cantidadProuctos, valorProducto);
        
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", cantidadProuctos=" + cantidadProuctos + ", valorProducto=" + valorProducto + '}';
    }
    
}
