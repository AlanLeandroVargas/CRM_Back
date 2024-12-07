package com.turnero.crm.entities;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.DateJdbcType;


@Entity(name = "Turno")
@Table
public class Turno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTurno")
    private int idTurno;
    @Column(name = "Fecha")
    private DateJdbcType fecha;
    @Column(name = "Disponible")
    private boolean disponible;
    @Column(name = "MedicoID")
    private int medicoID;
    @Column(name = "PacienteID")
    private int pacienteID;
    @Column(name = "EsPacienteAca")
    private boolean esPacienteAca;

    public Turno(){}
    public Turno(int idTurno, DateJdbcType fecha, boolean disponible, int medicoID, int pacienteID, boolean esPacienteAca) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.disponible = disponible;
        this.medicoID = medicoID;
        this.pacienteID = pacienteID;
        this.esPacienteAca = esPacienteAca;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public DateJdbcType getFecha() {
        return fecha;
    }

    public void setFecha(DateJdbcType fecha) {
        this.fecha = fecha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getMedicoID() {
        return medicoID;
    }

    public void setMedicoID(int medicoID) {
        this.medicoID = medicoID;
    }

    public int getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(int pacienteID) {
        this.pacienteID = pacienteID;
    }

    public boolean isEsPacienteAca() {
        return esPacienteAca;
    }

    public void setEsPacienteAca(boolean esPacienteAca) {
        this.esPacienteAca = esPacienteAca;
    }
}
