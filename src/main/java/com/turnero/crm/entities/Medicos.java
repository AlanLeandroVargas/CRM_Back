package com.turnero.crm.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Medicos")
public class Medicos {

    @Column(name = "MedicoID")
    private int medicoId;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;


    public Medicos() {
    }

    public Medicos(int medicoId, String apellido, String nombre) {
        this.medicoId = medicoId;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
