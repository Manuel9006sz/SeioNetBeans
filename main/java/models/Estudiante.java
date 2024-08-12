/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private int idEstudiante;
    private String telefonoContacto;
    private String emailContacto;
    private int edad;
    private int idIdgrado;
    private int personaIdEstudiante;

    // Getters y Setters
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdIdgrado() {
        return idIdgrado;
    }

    public void setIdIdgrado(int idIdgrado) {
        this.idIdgrado = idIdgrado;
    }

    public int getPersonaIdEstudiante() {
        return personaIdEstudiante;
    }

    public void setPersonaIdEstudiante(int personaIdEstudiante) {
        this.personaIdEstudiante = personaIdEstudiante;
    }
}

