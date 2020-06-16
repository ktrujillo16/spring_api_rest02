package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Usuario;
import com.redsocial.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepositorio dao;
	
	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Usuario insertaActualiza(Usuario obj) {
		// TODO Auto-generated method stub
		return dao.save(obj);
	}

}
