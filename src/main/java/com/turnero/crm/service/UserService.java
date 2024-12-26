package com.turnero.crm.service;

import com.turnero.crm.entities.User;
import com.turnero.crm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository usuarioRep;
    //Create
    public void createUser(User usuario){
        usuarioRep.save(usuario);
    }
    //Read
        //ById
    public User findUserById(Integer id){

        return usuarioRep.findById(id).orElse(null);
    }
        //All
    public List<User> listAllUsers(){
        return usuarioRep.findAll();
    }
    //Update
    public void updateUser(Integer id, User newUser){

        User usuario = usuarioRep.findById(id).orElseThrow();

        usuario.setNombre(newUser.getNombre());
        usuario.setApellido(newUser.getApellido());
        usuario.setDni(newUser.getDni());
        usuario.setEmail(newUser.getEmail());
        usuario.setRol(newUser.getRol());

    }
    //Delete
    public void deleteUser(Integer id){
        usuarioRep.deleteById(id);
    }


}
