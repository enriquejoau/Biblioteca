package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Detalle;

@Component
public class DetallePrestamoDaoImpl implements Operaciones<Detalle>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL =  "INSERT INTO detalle_prestamo (iddetalle, idprestamos, idlibro) values("+" 0, ?, ?)";
		return jdbcTemplate.update(SQL, t.getIdprestamo(), t.getIdlibro());
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Detalle> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select dp.iddetalle, dp.idprestamos, l.idlibro, l.titulo, l.autor from detalle_prestamo as dp "
				+ "inner join libros as l on dp.idlibro= l.idlibro "
				+ "inner join prestamos as p on dp.idprestamos= p.idprestamos";
		return jdbcTemplate.queryForList(SQL);
	}

}
