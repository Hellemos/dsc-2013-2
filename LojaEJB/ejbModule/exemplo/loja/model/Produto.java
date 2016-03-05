package exemplo.loja.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4161338866578904631L;
	private int id;
	private String descricao;
	private double preco;
	private double desconto;
	private ItensEmEstoque itensEmEstoque;
	private List<Fornecedor> fornecedores;
	
	public Produto() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@OneToOne
	public ItensEmEstoque getItensEmEstoque() {
		return itensEmEstoque;
	}
	public void setItensEmEstoque(ItensEmEstoque itensEmEstoque) {
		this.itensEmEstoque = itensEmEstoque;
	}

	@ManyToMany(mappedBy="produtos")
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
}
