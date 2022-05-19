package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "risks")
public class Risk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRisk;
	@Column(name = "topicRisk", nullable = false, length = 45)
	private String topicRisk;
	@Column(name = "descriptionRisk", nullable = false, length = 70)
	private String descriptionRisk;
	@Max(1)
	@Min(0)
	private double impactRisk;
	@Max(1)
	@Min(0)
	private double probabilityRisk;

	public Risk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTopicRisk() {
		return topicRisk;
	}

	public void setTopicRisk(String topicRisk) {
		this.topicRisk = topicRisk;
	}

	public Risk(int idRisk, String topicRisk, String descriptionRisk, double impactRisk, double probabilityRisk) {
		super();
		this.idRisk = idRisk;
		this.topicRisk = topicRisk;
		this.descriptionRisk = descriptionRisk;
		this.impactRisk = impactRisk;
		this.probabilityRisk = probabilityRisk;
	}

	public int getIdRisk() {
		return idRisk;
	}

	public void setIdRisk(int idRisk) {
		this.idRisk = idRisk;
	}

	public String getDescriptionRisk() {
		return descriptionRisk;
	}

	public void setDescriptionRisk(String descriptionRisk) {
		this.descriptionRisk = descriptionRisk;
	}

	public double getImpactRisk() {
		return impactRisk;
	}

	public void setImpactRisk(double impactRisk) {
		this.impactRisk = impactRisk;
	}

	public double getProbabilityRisk() {
		return probabilityRisk;
	}

	public void setProbabilityRisk(double probabilityRisk) {
		this.probabilityRisk = probabilityRisk;
	}

}
