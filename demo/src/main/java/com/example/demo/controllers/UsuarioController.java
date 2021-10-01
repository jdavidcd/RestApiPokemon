package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pokemon")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    
    @GetMapping("/pag/{pageNo}/{pageSize}")
    // @PageableDefault(size =10, page =0)List
     public List<UsuarioModel> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
         return usuarioService.encontrarPagina(pageNo, pageSize);
     }
    
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
    
    @GetMapping("/query")
    public List<UsuarioModel> obtenerUsuarioPorName(@RequestParam("name") String name){
        return this.usuarioService.obtenerPorName(name);
    }
}