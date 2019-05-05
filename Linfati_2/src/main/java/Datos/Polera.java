/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author gilio
 */
public class Polera {

    private String talla;
    private String material;
    private boolean estampado;

    public Polera(String Talla, String Material, boolean Estampado) {
        talla = Talla;
        material = Material;
        estampado = Estampado;
    }

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getEstanpado() {
        return estampado;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEstanpado(boolean estampado) {
        this.estampado = estampado;
    }

}
