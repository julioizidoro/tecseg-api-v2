package br.com.tecsegapi.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "partecorpo")
public class Partecorpo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpartecorpo")
    private Integer idpartecorpo;
	@Column(name = "descricao")
	private String descricao;
	
	public Partecorpo() {
		super();
	}

	public Integer getIdpartecorpo() {
		return idpartecorpo;
	}

	public void setIdpartecorpo(Integer idpartecorpo) {
		this.idpartecorpo = idpartecorpo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Partecorpo [idpartecorpo=" + idpartecorpo + ", descricao=" + descricao + "]";
	}
	
	
	
	

}
