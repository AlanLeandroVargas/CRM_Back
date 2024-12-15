package com.turnero.crm.entities;

import jakarta.persistence.*;

import java.util.List;

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
    @JoinColumn(name = "IDEspecialidades")
    private List<Especialidades> especialidades;

    @ManyToOne
    @JoinColumn(name = "IDTurno")
    private List<Turno> idTurno;

    public Especialista() {
    }

    public Especialista(String nombre, String apellido, List<Especialidades> especialidades, List<Turno> idTurno) {
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

    public List<Especialidades> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidades> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Turno> getIDTurno() {
        return idTurno;
    }

    public void setIDTurno(List<Turno> IDTurno) {
        this.idTurno = idTurno;
    }
}
