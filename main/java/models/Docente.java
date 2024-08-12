/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Usuario
 */
public class Docente {
    private int idDocente;
    private String institucion;
    private int personaIdDocente;

    // Getters y Setters
    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getPersonaIdDocente() {
        return personaIdDocente;
    }

    public void setPersonaIdDocente(int personaIdDocente) {
        this.personaIdDocente = personaIdDocente;
    }
}

