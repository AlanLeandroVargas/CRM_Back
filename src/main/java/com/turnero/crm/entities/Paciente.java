package com.turnero.crm.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPaciente")
    private int idPaciente;

    @OneToMany
    @JoinColumn(name = "Turno")
    private List<Turno> turnos;


    @JoinColumn(name = "Dni")
    private int dni;

    public Paciente() {
    }

    public Paciente(int idPaciente, List<Turno> turnos, int dni) {
        this.idPaciente = idPaciente;
        this.turnos = turnos;
        this.dni = dni;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(int turno) {
        this.turnos = turnos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
