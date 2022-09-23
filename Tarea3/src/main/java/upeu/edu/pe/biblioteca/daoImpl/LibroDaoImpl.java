package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Libro;

@Component
public class LibroDaoImpl implements Operaciones<Libro> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Libro t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO 	libros (idlibro, titulo, autor, editorial) values("
				+ " 0, ?, ?,?)";
		return jdbcTemplate.update(SQL, t.getTitulo(), t.getAutor(), t.getEditorial());
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
		String  SQL = "SELECT * FROM biblioteca.libros";
		return jdbcTemplate.queryForList(SQL);
	}

}
