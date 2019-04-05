/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author jonnathan
 */
public class Estudiante extends Persona {
    private Carrera carrera;

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", carreras=" + carrera + '}';
    }

    

    public void setCarrera(Carrera carrera) {
        this.codigo = codigo;
    }

}