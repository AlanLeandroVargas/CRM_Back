package com.turnero.crm.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Especialista")
public class Especialista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEspecialista")
    private int idEspecialista;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "Especialidades")
    private Especialidades especialidades;

    @ManyToOne
    @JoinColumn(name = "IDTurno")
    private Turno idTurno;

    public Especialista() {
    }

    public Especialista(String nombre, String apellido, Especialidades especialidades, Turno idTurno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidades = especialidades;
        this.idTurno = idTurno;
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

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    public Turno getIDTurno() {
        return idTurno;
    }

    public void setIDTurno(Turno IDTurno) {
        this.idTurno = idTurno;
    }
}
