package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void deletar(Long id);
	
	Cargo bucarPorId(Long id);
	
	List<Cargo> buscarTodos();

}
