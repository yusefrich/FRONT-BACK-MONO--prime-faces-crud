package br.com.contaspagar.DAO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="contas_pagar")

public class ContasPagar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="data_vencimento")
	private Date data_vencimento;

	@Column(name="valor")
	private double valor;

	@ManyToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;

}
