package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IRiskDao;
import pe.edu.upc.entity.Risk;
import pe.edu.upc.serviceinterface.IRiskService;

@Named
@RequestScoped
public class RiskServiceImpl implements IRiskService {
	@Inject
	private IRiskDao rD;

	public void insert(Risk risk) {
		rD.insert(risk);
	}

	public List<Risk> list() {
		// TODO Auto-generated method stub
		return rD.list();
	}

	public List<Risk> findByNameRisk(Risk r) {
		// TODO Auto-generated method stub
		return rD.findByNameRisk(r);
	}
}
