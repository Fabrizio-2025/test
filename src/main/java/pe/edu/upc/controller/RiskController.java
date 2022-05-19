package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Risk;
import pe.edu.upc.serviceinterface.IRiskService;

@Named
@RequestScoped
public class RiskController {
	@Inject
	private IRiskService rS;

	private Risk risk;

	List<Risk> listRisks;

	// Constructor
	@PostConstruct
	public void init() {
		this.risk = new Risk();
		this.listRisks = new ArrayList<Risk>();
		this.list();
	}

	// métodos personalizados

	public String newRisk() {
		this.setRisk(new Risk());
		return "risk.xhtml";
	}

	public void insert() {
		try {

			rS.insert(risk);
			this.clean();
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void list() {
		try {
			listRisks = rS.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clean() {
		this.init();
	}

	public void findByName() {
		try {
			if (risk.getTopicRisk().isEmpty()) {
				this.list();
			} else {
				listRisks = this.rS.findByNameRisk(this.getRisk());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// get y set

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public List<Risk> getListRisks() {
		return listRisks;
	}

	public void setListRisks(List<Risk> listRisks) {
		this.listRisks = listRisks;
	}

}
