package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public List <UsuarioModel> obtenerUsuarios(){
    	return (List<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public List<UsuarioModel>  obtenerPorName(String name) {
        return usuarioRepository.findByName(name);
    }

	@Override
	public List<UsuarioModel> encontrarPagina(int pageNo, int pageSize) {
		PageRequest paging = PageRequest.of(pageNo, pageSize);
		Page <UsuarioModel> pageResult = usuarioRepository.findAll(paging);
		List <UsuarioModel> pageFinal = pageResult.toList();
		return pageFinal;
	}
    
}