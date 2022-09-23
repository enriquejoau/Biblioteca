package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Libro;
import upeu.edu.pe.biblioteca.services.LibroService;



@RestController
@RequestMapping("/api/libro")
public class LibroController {
	@Autowired
	private LibroService libroService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return libroService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Libro libro){
	 return libroService.create(libro);	
	}
}
