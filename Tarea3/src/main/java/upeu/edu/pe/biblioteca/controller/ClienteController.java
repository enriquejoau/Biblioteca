package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Cliente;
import upeu.edu.pe.biblioteca.services.ClienteService;



@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return clienteService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Cliente cliente){
	 return clienteService.create(cliente);	
	}
	
}
