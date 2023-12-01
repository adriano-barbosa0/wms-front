package com.project.wms.controller;

import com.project.wms.DAO.IUser;
import com.project.wms.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private IUser dao;
    @GetMapping
    public List<Usuario> listUsers () {
        return (List<Usuario>) dao.findAll();
    }
    @PostMapping
    public Usuario createUsuario (@RequestBody Usuario usuario){
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }
    @PutMapping
    public Usuario editUsuario (@RequestBody Usuario usuario){
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }
    @DeleteMapping("/{id}")
    public Optional <Usuario> excluirUsuario (@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }

}
