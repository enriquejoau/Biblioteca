package upeu.edu.pe.biblioteca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoImpl.LibroDaoImpl;
import upeu.edu.pe.biblioteca.entity.Libro;

@Service
public class LibroService implements Operaciones<Libro> {
	
	@Autowired
	private LibroDaoImpl daoImpl;
	@Override
	public int create(Libro t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Libro t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}
	

}
