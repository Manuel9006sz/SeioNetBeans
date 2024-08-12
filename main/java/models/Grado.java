/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Usuario
 */
public class Grado {
    private int idgrado;
    private String nivel;
    private String curso;
    private String anoMatricula;
    private int docenteIdGrado;

    // Getters y Setters
    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(String anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public int getDocenteIdGrado() {
        return docenteIdGrado;
    }

    public void setDocenteIdGrado(int docenteIdGrado) {
        this.docenteIdGrado = docenteIdGrado;
    }
}

