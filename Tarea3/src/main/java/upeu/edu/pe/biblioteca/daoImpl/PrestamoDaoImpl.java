package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Prestamo;

@Component
public class PrestamoDaoImpl implements Operaciones<Prestamo>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO 	prestamos (idprestamos, fecha_prestamo, fecha_devolucion, idempleados, idcliente) values("
				+ " 0, now(), curdate(), ?,?)";
		return jdbcTemplate.update(SQL, t.getIdempleado(), t.getIdcliente());
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "select p.idprestamos,p.fecha_prestamo,p.fecha_devolucion, e.username as empleado, concat(c.nombres,' ',c.apellidos) as cliente from prestamos as p "
				+ "inner join empleados as e on p.idempleados = e.idempleados "
				+ "inner join clientes as c on p.idcliente = c.idcliente";
		return jdbcTemplate.queryForList(SQL);
	}
	
}
