package com.turnero.crm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Especialista")
public class Especialista {

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Especialidades")
    private int Especialidades;
    @Column(name = "IDTurno")
    private int IDTurno;

    public Especialista() {
    }

    public Especialista(String nombre, String apellido, int especialidades, int IDTurno) {
        this.nombre = nombre;
        this.apellido = apellido;
        Especialidades = especialidades;
        this.IDTurno = IDTurno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(int especialidades) {
        Especialidades = especialidades;
    }

    public int getIDTurno() {
        return IDTurno;
    }

    public void setIDTurno(int IDTurno) {
        this.IDTurno = IDTurno;
    }
}
