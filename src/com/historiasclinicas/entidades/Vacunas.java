package com.historiasclinicas.entidades;
// Generated 18-feb-2017 9:47:15 by Hibernate Tools 5.2.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vacunas generated by hbm2java
 */
@Entity
@Table(name = "vacunas", catalog = "histocons")
public class Vacunas implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8182812903967237434L;
	private String bcg;
	private String dpt;
	private String dta;
	private String hepA;
	private String hepB;
	private String hib;
	private Integer idVacunas;
	private Boolean otras;
	private int paciente;
	private String prs;
	private String sabin;

	public Vacunas() {
	}

	public Vacunas(int paciente) {
		this.paciente = paciente;
	}

	public Vacunas(int paciente, String bcg, String sabin, String hepB, String dpt, String hib, String prs, String dta,
			String hepA, Boolean otras) {
		this.paciente = paciente;
		this.bcg = bcg;
		this.sabin = sabin;
		this.hepB = hepB;
		this.dpt = dpt;
		this.hib = hib;
		this.prs = prs;
		this.dta = dta;
		this.hepA = hepA;
		this.otras = otras;
	}

	@Column(name = "BCG", length = 30)
	public String getBcg() {
		return bcg;
	}

	@Column(name = "DPT", length = 30)
	public String getDpt() {
		return dpt;
	}

	@Column(name = "DTa", length = 30)
	public String getDta() {
		return dta;
	}

	@Column(name = "HepA", length = 30)
	public String getHepA() {
		return hepA;
	}

	@Column(name = "HepB", length = 30)
	public String getHepB() {
		return hepB;
	}

	@Column(name = "HIB", length = 30)
	public String getHib() {
		return hib;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idVacunas", unique = true, nullable = false)
	public Integer getIdVacunas() {
		return idVacunas;
	}

	@Column(name = "Otras")
	public Boolean getOtras() {
		return otras;
	}

	@Column(name = "paciente", nullable = false)
	public int getPaciente() {
		return paciente;
	}

	@Column(name = "PRS", length = 30)
	public String getPrs() {
		return prs;
	}

	@Column(name = "Sabin", length = 30)
	public String getSabin() {
		return sabin;
	}

	public void setBcg(String bcg) {
		this.bcg = bcg;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public void setDta(String dta) {
		this.dta = dta;
	}

	public void setHepA(String hepA) {
		this.hepA = hepA;
	}

	public void setHepB(String hepB) {
		this.hepB = hepB;
	}

	public void setHib(String hib) {
		this.hib = hib;
	}

	public void setIdVacunas(Integer idVacunas) {
		this.idVacunas = idVacunas;
	}

	public void setOtras(Boolean otras) {
		this.otras = otras;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public void setPrs(String prs) {
		this.prs = prs;
	}

	public void setSabin(String sabin) {
		this.sabin = sabin;
	}

}
