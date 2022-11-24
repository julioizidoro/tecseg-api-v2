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
@Table(name = "situacaocolaborador")
public class SituacaoColaborador implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsituacaocolaborador")
    private Integer idsituacaocolaborador;
	@Column(name = "nome")
	private String nome;

	
	public SituacaoColaborador() {
		super();
	}


	public Integer getIdsituacaocolaborador() {
		return idsituacaocolaborador;
	}


	public void setIdsituacaocolaborador(Integer idsituacaocolaborador) {
		this.idsituacaocolaborador = idsituacaocolaborador;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "SituacaoColaborador [nome=" + nome + "]";
	}

}
