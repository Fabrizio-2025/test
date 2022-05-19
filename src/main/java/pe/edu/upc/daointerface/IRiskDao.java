package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Risk;

public interface IRiskDao {
	public void insert(Risk risk);

	public List<Risk> list();
	
	public List<Risk> findByNameRisk(Risk r);
}
