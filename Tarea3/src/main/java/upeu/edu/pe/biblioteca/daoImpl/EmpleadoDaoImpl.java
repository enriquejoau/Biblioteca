package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Empleado;

@Component
public class EmpleadoDaoImpl implements Operaciones<Empleado>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Empleado t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO  empleados (idempleados, username, password) values("
				+ " 0, ?, ?)";
		return jdbcTemplate.update(SQL, t.getUsername(), t.getPassword());
	}

	@Override
	public int update(Empleado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM biblioteca.empleados";
		return jdbcTemplate.queryForList(SQL);
	}

}
