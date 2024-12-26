package com.turnero.crm.service;

import com.turnero.crm.entities.Turno;
import com.turnero.crm.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    @Autowired
    TurnoRepository turnoRep;

    //Create
    public void createTurno(Turno nuevoTurno){
        turnoRep.save(nuevoTurno);
    }
    //Read
        //All
    public List<Turno> listAllTurnos(){
        return turnoRep.findAll();
    }

        //By ID
    public Turno listById(Integer id){
        return turnoRep.findById(id).orElse(null);
    }
    //Update
    public void updateTurno(){

    }
    //Delete
    public void deleteTurno(Integer id){
        turnoRep.deleteById(id);
    }
}
