package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;

@Service
public interface IUsuarioService {
	 List <UsuarioModel> encontrarPagina(int pageNo, int pageSize);
}
