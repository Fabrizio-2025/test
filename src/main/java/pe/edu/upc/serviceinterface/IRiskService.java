package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Risk;

public interface IRiskService {
	public void insert(Risk risk);

	public List<Risk> list();
	
	public List<Risk> findByNameRisk(Risk r);
}
