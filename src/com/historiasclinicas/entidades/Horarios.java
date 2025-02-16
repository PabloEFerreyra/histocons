package com.historiasclinicas.entidades;
// Generated 18-feb-2017 9:47:15 by Hibernate Tools 5.2.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Horarios generated by hbm2java
 */
@Entity
@Table(name = "horarios", catalog = "histocons")
public class Horarios implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -9159075905207851669L;
	private String hora;
	private Integer idhorarios;

	public Horarios() {
	}

	public Horarios(String hora) {
		this.hora = hora;
	}

	@Column(name = "hora", nullable = false, length = 5)
	public String getHora() {
		return hora;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idhorarios", unique = true, nullable = false)
	public Integer getIdhorarios() {
		return idhorarios;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setIdhorarios(Integer idhorarios) {
		this.idhorarios = idhorarios;
	}

}
