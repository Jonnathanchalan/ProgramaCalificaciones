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

    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
        this.carrera = carrera;
    }
    private Carrera carrera;
        
        
        
    }
   


