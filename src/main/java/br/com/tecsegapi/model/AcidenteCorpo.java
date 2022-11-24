package br.com.tecsegapi.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "acidentecorpo")
public class AcidenteCorpo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaceidentecorpo")
    private Integer idacidentecorpo;
	@Column(name = "lesao")
	private String lesao;
	@JoinColumn(name = "partecorpo_idpartecorpo", referencedColumnName = "idpartecorpo")
    @ManyToOne(optional = false)
    private Partecorpo parteCorpo;
	@JoinColumn(name = "acidente_idacidente", referencedColumnName = "idacidente")
    @ManyToOne(optional = false)
    private Acidente acidente;
	
	public AcidenteCorpo() {
		super();
	}

	public Integer getIdacidentecorpo() {
		return idacidentecorpo;
	}

	public void setIdacidentecorpo(Integer idacidentecorpo) {
		this.idacidentecorpo = idacidentecorpo;
	}

	public String getLesao() {
		return lesao;
	}

	public void setLesao(String lesao) {
		this.lesao = lesao;
	}

	public Partecorpo getParteCorpo() {
		return parteCorpo;
	}

	public void setParteCorpo(Partecorpo parteCorpo) {
		this.parteCorpo = parteCorpo;
	}

	public Acidente getAcidente() {
		return acidente;
	}

	public void setAcidente(Acidente acidente) {
		this.acidente = acidente;
	}

	@Override
	public String toString() {
		return "AcidenteCorpo [lesao=" + lesao + "]";
	}
	
}
