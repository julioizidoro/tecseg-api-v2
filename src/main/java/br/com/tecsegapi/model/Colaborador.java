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
@Table(name = "colaborador")
public class Colaborador implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcolaborador")
    private Integer idcolaborador;
	@Column(name = "nome")
	private String nome;
	@JoinColumn(name = "funcao_idfuncao", referencedColumnName = "idfuncao")
    @ManyToOne(optional = false)
    private Funcao funcao;
	@JoinColumn(name = "situacaocolaborador_idsituacaocolaborador", referencedColumnName = "idsituacaocolaborador")
    @ManyToOne(optional = false)
    private SituacaoColaborador situacaoColaborador;
	
	public Colaborador() {
		super();
	}

	public Integer getIdcolaborador() {
		return idcolaborador;
	}

	public void setIdcolaborador(Integer idcolaborador) {
		this.idcolaborador = idcolaborador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	
	

	public SituacaoColaborador getSituacaoColaborador() {
		return situacaoColaborador;
	}

	public void setSituacaoColaborador(SituacaoColaborador situacaoColaborador) {
		this.situacaoColaborador = situacaoColaborador;
	}

	@Override
	public String toString() {
		return "Colaborador [idcolaborador=" + idcolaborador + ", nome=" + nome + ", funcao=" + funcao + "]";
	}
	
	
	
	
	

}
