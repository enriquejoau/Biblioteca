package upeu.edu.pe.biblioteca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoImpl.ClienteDaoImpl;
import upeu.edu.pe.biblioteca.entity.Cliente;

@Service
public class ClienteService implements Operaciones<Cliente>{
	
	@Autowired
	private ClienteDaoImpl daoImpl;
	@Override
	public int create(Cliente t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}
	

}
