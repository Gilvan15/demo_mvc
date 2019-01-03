package com.mballem.curso.boot.service;

import java.util.List;
import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void deletar(Long id);

	Funcionario bucarPorId(Long id);

	List<Funcionario> buscarTodos();

}
