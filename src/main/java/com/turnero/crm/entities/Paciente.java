package com.turnero.crm.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPaciente")
    private int idPaciente;
    @Column(name = "Turno")
    private int turno;
    @Column(name = "Dni")
    private int dni;


    public Paciente() {
    }

    public Paciente(int idPaciente, int turno, int dni) {
        this.idPaciente = idPaciente;
        this.turno = turno;
        this.dni = dni;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
