/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;



/**
 *
 * @author jonnathan
 */
public class HistorialCalificaciones {

    @Override
    public String toString() {
        return "HistorialCalificaciones{" + "codigo=" + codigo + ", estudiante=" + estudiante + ", aprovechamiento1=" + aprovechamiento1 + ", examen1=" + examen1 + ", aprovechamiento2=" + aprovechamiento2 + ", examen2=" + examen2 + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getAprovechamiento1() {
        return aprovechamiento1;
    }

    public void setAprovechamiento1(int aprovechamiento1) {
        this.aprovechamiento1 = aprovechamiento1;
    }

    public int getExamen1() {
        return examen1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public int getAprovechamiento2() {
        return aprovechamiento2;
    }

    public void setAprovechamiento2(int aprovechamiento2) {
        this.aprovechamiento2 = aprovechamiento2;
    }

    public int getExamen2() {
        return examen2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }
    protected int codigo;
    private String estudiante;
    private int aprovechamiento1;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;
     
    
    

}
