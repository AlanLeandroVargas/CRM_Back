package com.turnero.crm.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Especialidades")
public class Especialidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEspecialidad")
    private int idEspecialidad;
    @Column(name = "MedicoID")
    private int medicoID;
    @Column(name = "Especialidad")
    private String especialidad;



    public Especialidades() {
    }

    public Especialidades(int idEspecialidad, String especialidad, int medicoID) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
        this.medicoID = medicoID;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getMedicoID() {
        return medicoID;
    }

    public void setMedicoID(int medicoID) {
        this.medicoID = medicoID;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
