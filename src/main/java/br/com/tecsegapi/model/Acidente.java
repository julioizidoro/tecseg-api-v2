package br.com.tecsegapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "acidente")
public class Acidente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacidente")
    private Integer idacidente;
	@Column(name = "data")
	@Temporal(TemporalType.DATE)
	private Date data;
	@Column(name = "doenca")
	private String doenca;
	@Column(name = "cat")
	private Boolean cat;
	@Column(name = "diasAtestado")
	private Integer diasAtestado;
	@Column(name = "afastamentoInss")
	private Boolean afastamentoInss;
	@Column(name = "planoAcao")
	private String planoAcao;
	@JoinColumn(name = "colaborador_acidentado", referencedColumnName = "idcolaborador")
    @ManyToOne(optional = false)
    private Colaborador funcionario;
	@JoinColumn(name = "colaborador_superior", referencedColumnName = "idcolaborador")
    @ManyToOne(optional = false)
    private Colaborador superior;
	@JoinColumn(name = "obra_idobra", referencedColumnName = "idobra")
    @ManyToOne(optional = false)
    private Obra obra;
	
	public Acidente() {
		super();
	}

	public Integer getIdacidente() {
		return idacidente;
	}

	public void setIdacidente(Integer idacidente) {
		this.idacidente = idacidente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public Boolean getCat() {
		return cat;
	}

	public void setCat(Boolean cat) {
		this.cat = cat;
	}

	public Integer getDiasAtestado() {
		return diasAtestado;
	}

	public void setDiasAtestado(Integer diasAtestado) {
		this.diasAtestado = diasAtestado;
	}

	public Boolean getAfastamentoInss() {
		return afastamentoInss;
	}

	public void setAfastamentoInss(Boolean afastamentoInss) {
		this.afastamentoInss = afastamentoInss;
	}

	public String getPlanoAcao() {
		return planoAcao;
	}

	public void setPlanoAcao(String planoAcao) {
		this.planoAcao = planoAcao;
	}

	public Colaborador getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Colaborador funcionario) {
		this.funcionario = funcionario;
	}

	public Colaborador getSuperior() {
		return superior;
	}

	public void setSuperior(Colaborador superior) {
		this.superior = superior;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	@Override
	public String toString() {
		return "Acidente [idacidente=" + idacidente + ", data=" + data + ", funcionario=" + funcionario + ", superior="
				+ superior + ", obra=" + obra + "]";
	}
		
	
	
	

}

