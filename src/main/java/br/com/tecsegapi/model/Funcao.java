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
@Table(name = "funcao")
public class Funcao implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfuncao")
    private Integer idfuncao;
	@Column(name = "cbo")
	private String cbo;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "nomereduzido")
	private String nomeReduzido;
	
	public Funcao() {
		super();
	}

	public Integer getIdfuncao() {
		return idfuncao;
	}

	public void setIdfuncao(Integer idfuncao) {
		this.idfuncao = idfuncao;
	}

	public String getCbo() {
		return cbo;
	}

	public void setCbo(String cbo) {
		this.cbo = cbo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeReduzido() {
		return nomeReduzido;
	}

	public void setNomeReduzido(String nomeReduzido) {
		this.nomeReduzido = nomeReduzido;
	}

	@Override
	public String toString() {
		return "Funcao [cbo=" + cbo + ", nomeReduzido=" + nomeReduzido + "]";
	}
	
	
	

}
