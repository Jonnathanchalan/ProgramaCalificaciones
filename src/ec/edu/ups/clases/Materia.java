/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.clases.Grupo;

/**
 *
 * @author jonnathan
 */
public class Materia {

    public Materia(int codigo, String nombre, String direccion, int numeroCreditos, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCreditos = numeroCreditos;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", numeroCreditos=" + numeroCreditos + ", nivel=" + nivel + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    protected int codigo;
    private String nombre;
    private String direccion;
    private int numeroCreditos;
    private int nivel;
   

    
}
