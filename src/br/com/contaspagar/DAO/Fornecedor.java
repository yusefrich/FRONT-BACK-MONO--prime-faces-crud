package br.com.contaspagar.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Entity
@Table(name="Fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="telefone")
	private String telefone;

	@Column(name="endereco")
	private String endereco;
	
	@Column(name="obs")
	private String obs;
	
	public List<Fornecedor> GetALL(){
		EntityManager em = getEntityManager();
		List<Fornecedor> lista = null;
		
		return lista;

	}

	private EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
