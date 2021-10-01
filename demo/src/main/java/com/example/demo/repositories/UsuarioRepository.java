package com.example.demo.repositories;

import java.util.List;

import com.example.demo.models.UsuarioModel;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
//, 
@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioModel, Long> {
	public abstract List<UsuarioModel> findByName(String name);
}