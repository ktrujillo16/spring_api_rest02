package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entidad.Usuario;
import com.redsocial.service.UsuarioService;

@RestController
@RequestMapping("/api/sedenorte")
public class UsuarioController {

	@Autowired
	private UsuarioService servicio;
	
	@GetMapping()
	public ResponseEntity<List<Usuario>>lista(){
		return ResponseEntity.ok(servicio.listarTodos());
	}
	
	@PostMapping()
	public ResponseEntity<Usuario> registra(@RequestBody Usuario obj){
		return ResponseEntity.ok(servicio.insertaActualiza(obj));
	}
}
