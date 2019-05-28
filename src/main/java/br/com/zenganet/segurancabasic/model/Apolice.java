package br.com.zenganet.segurancabasic.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Apolice {

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "cliente_fk")
	private Cliente cliente;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_apolice")
	private long codigoApolice;
	private long proposta;
	private BigDecimal premio;

	public long getCodigoApolice() {
		return codigoApolice;
	}

	public void setCodigoApolice(long codigoApolice) {
		this.codigoApolice = codigoApolice;
	}

	public long getProposta() {
		return proposta;
	}

	public void setProposta(long proposta) {
		this.proposta = proposta;
	}

	public BigDecimal getPremio() {
		return premio;
	}

	public void setPremio(BigDecimal premio) {
		this.premio = premio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
